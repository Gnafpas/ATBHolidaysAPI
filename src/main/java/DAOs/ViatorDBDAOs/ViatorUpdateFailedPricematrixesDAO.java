package DAOs.ViatorDBDAOs;

import Beans.ViatorDBBeans.ViatorUpdateFailedPricematrixesBean;
import DBConnection.HibernateUtil;
import com.mysql.cj.core.exceptions.CJCommunicationsException;
import org.hibernate.HibernateException;
import org.hibernate.StatelessSession;
import org.hibernate.Transaction;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import static Controller.Application.errLogger;

/**
 * Created by George on 20/08/2017.
 */
public class ViatorUpdateFailedPricematrixesDAO {

    public static boolean addViatorUpdateFailedPricematrixes(ViatorUpdateFailedPricematrixesBean viatorUpdateFailedPricematrixesBean){

        StatelessSession session = HibernateUtil.getSession();
        Transaction tx;
        boolean err=false;
        try{
            tx=session.beginTransaction();
            session.insert(viatorUpdateFailedPricematrixesBean);
            tx.commit();
        }catch (HibernateException e) {
            err=true;
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            errLogger.info(errors.toString());
        }catch (ExceptionInInitializerError e) {
            err=true;
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            errLogger.info(errors.toString());
        }catch (CJCommunicationsException e){
            err=true;
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            errLogger.info(errors.toString());
        }finally {
            session.close();
        }
        return err;
    }

    public static List<String> getProductCodeByUpdateRid(int updateRid){

        StatelessSession session = HibernateUtil.getSession();
        List<String> failedProductCodes=null;
        String hql ="Select failedProducts.productWithFailedPricematrixes FROM ViatorUpdateFailedPricematrixesBean failedProducts " +
                "WHERE failedProducts.updateRid = :updateRid ";
        try{
            session.beginTransaction();
            failedProductCodes=session.createQuery(hql).setParameter("updateRid", updateRid).getResultList();
            session.getTransaction().commit();
        }catch (HibernateException e) {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            errLogger.info(errors.toString());
        }catch (ExceptionInInitializerError e) {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            errLogger.info(errors.toString());
        }catch (CJCommunicationsException e){
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            errLogger.info(errors.toString());
        }finally {
            session.close();
        }
        return failedProductCodes;
    }
}
