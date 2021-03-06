package Beans.HotelBedsAPIBeans.Deafult;

/**
 * Created by George on 12/01/2018.
 */
public class APIJSONMetada {

    private int from;
    private int to;
    private int total;
    private AuditData auditData ;
    private Error error=null;


    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public AuditData getAuditData() {
        return auditData;
    }

    public void setAuditData(AuditData auditData) {
        this.auditData = auditData;
    }
}
