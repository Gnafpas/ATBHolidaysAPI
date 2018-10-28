
package DAOs.CarnectAPIDAOs.ServiceDAOs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceSoap", targetNamespace = "http://www.opentravel.org/OTA/2003/05")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceSoap {


    /**
     * Diplays service availbility.
     * 
     * @param pingRQ
     * @return
     *     returns org.opentravel.ota._2003._05.PingRS
     */
    @WebMethod(action = "http://www.opentravel.org/OTA/2003/05/getPing")
    @WebResult(name = "PingRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "getPingResult")
    public PingRS getPing(
        @WebParam(name = "PingRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "PingRQ")
        PingRQ pingRQ);

    /**
     * Diplays an array of locationList.
     * 
     * @param vehLocationSearchRQ
     * @return
     *     returns org.opentravel.ota._2003._05.VehLocationSearchRS
     */
    @WebMethod(action = "http://www.opentravel.org/OTA/2003/05/getVehLocationSearch")
    @WebResult(name = "VehLocationSearchRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "getVehLocationSearchResult")
    public VehLocationSearchRS getVehLocationSearch(
        @WebParam(name = "VehLocationSearchRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "VehLocationSearchRQ")
        VehLocationSearchRQ vehLocationSearchRQ);

    /**
     * Diplays details of desired location.
     * 
     * @param vehLocDetailRQ
     * @return
     *     returns org.opentravel.ota._2003._05.VehLocDetailRS
     */
    @WebMethod(action = "http://www.opentravel.org/OTA/2003/05/getVehLocDetail")
    @WebResult(name = "VehLocDetailRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "getVehLocDetailResult")
    public VehLocDetailRS getVehLocDetail(
        @WebParam(name = "VehLocDetailRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "VehLocDetailRQ")
        VehLocDetailRQ vehLocDetailRQ);

    /**
     * Diplays an array of AvailRates.
     * 
     * @param vehAvailRateRQ
     * @return
     *     returns org.opentravel.ota._2003._05.VehAvailRateRS
     */
    @WebMethod(action = "http://www.opentravel.org/OTA/2003/05/getVehAvailRate")
    @WebResult(name = "VehAvailRateRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "getVehAvailRateResult")
    public VehAvailRateRS getVehAvailRate(
        @WebParam(name = "VehAvailRateRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "VehAvailRateRQ")
        VehAvailRateRQ vehAvailRateRQ);

    /**
     * Creates a Reservation and inster into system
     * 
     * @param vehResRQ
     * @return
     *     returns org.opentravel.ota._2003._05.VehResRS
     */
    @WebMethod(action = "http://www.opentravel.org/OTA/2003/05/getVehReservation")
    @WebResult(name = "VehResRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "getVehReservationResult")
    public VehResRS getVehReservation(
        @WebParam(name = "VehResRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "VehResRQ")
        VehResRQ vehResRQ);

    /**
     * Display an existing Reservation
     * 
     * @param vehRetRQ
     * @return
     *     returns org.opentravel.ota._2003._05.VehRetResRS
     */
    @WebMethod(action = "http://www.opentravel.org/OTA/2003/05/getVehRetReservation")
    @WebResult(name = "VehRetResRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "getVehRetReservationResult")
    public VehRetResRS getVehRetReservation(
        @WebParam(name = "VehRetResRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "VehRetRQ")
        VehRetResRQ vehRetRQ);

    /**
     * Cancel an existing Reservation
     * 
     * @param vehCancelResRQ
     * @return
     *     returns org.opentravel.ota._2003._05.VehCancelResRS
     */
    @WebMethod(action = "http://www.opentravel.org/OTA/2003/05/getVehCancelReservation")
    @WebResult(name = "VehCancelResRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "getVehCancelReservationResult")
    public VehCancelResRS getVehCancelReservation(
        @WebParam(name = "VehCancelResRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "VehCancelResRQ")
        VehCancelResRQ vehCancelResRQ);

    /**
     * Modifies an existing Reservation
     * 
     * @param vehModifyResRQ
     * @return
     *     returns org.opentravel.ota._2003._05.VehModifyRS
     */
    @WebMethod(action = "http://www.opentravel.org/OTA/2003/05/getVehModify")
    @WebResult(name = "VehModifyRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "getVehModifyResult")
    public VehModifyRS getVehModify(
        @WebParam(name = "VehModifyRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "VehModifyResRQ")
        VehModifyRQ vehModifyResRQ);

    /**
     * Returns rate rules for requeste availrate reference
     * 
     * @param vehRateRuleRQ
     * @return
     *     returns org.opentravel.ota._2003._05.VehRateRuleRS
     */
    @WebMethod(action = "http://www.opentravel.org/OTA/2003/05/getVehRateRule")
    @WebResult(name = "VehRateRuleRS", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "getVehRateRuleResult")
    public VehRateRuleRS getVehRateRule(
        @WebParam(name = "VehRateRuleRQ", targetNamespace = "http://www.opentravel.org/OTA/2003/05", partName = "VehRateRuleRQ")
        VehRateRuleRQ vehRateRuleRQ);

}
