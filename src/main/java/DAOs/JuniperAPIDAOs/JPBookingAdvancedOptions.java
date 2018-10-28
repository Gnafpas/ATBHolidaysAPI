
package DAOs.JuniperAPIDAOs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JP_BookingAdvancedOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JP_BookingAdvancedOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.juniper.es/webservice/2007/}JP_BaseAdvancedOptions">
 *       &lt;sequence>
 *         &lt;element name="UseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendMailTo" type="{http://www.juniper.es/webservice/2007/}JP_SendMailTo" minOccurs="0"/>
 *         &lt;element name="ShowBreakdownPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JP_BookingAdvancedOptions", propOrder = {
    "useCurrency",
    "sendMailTo",
    "showBreakdownPrice"
})
@XmlSeeAlso({
    JPCruiseBookingAdvancedOptions.class,
    JPRentacarBookingAdvancedOptions.class,
    JPFlightBookingAdvancedOptions.class,
    JPHotelBookingAdvancedOptions.class,
    JPPackageBookingAdvancedOptions.class,
    JPServicesBookingAdvancedOptions.class,
    JPInsuranceBookingAdvancedOptions.class
})
public abstract class JPBookingAdvancedOptions
    extends JPBaseAdvancedOptions
{

    @XmlElement(name = "UseCurrency")
    protected String useCurrency;
    @XmlElement(name = "SendMailTo")
    @XmlSchemaType(name = "string")
    protected JPSendMailTo sendMailTo;
    @XmlElement(name = "ShowBreakdownPrice")
    protected Boolean showBreakdownPrice;

    /**
     * Gets the value of the useCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCurrency() {
        return useCurrency;
    }

    /**
     * Sets the value of the useCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCurrency(String value) {
        this.useCurrency = value;
    }

    /**
     * Gets the value of the sendMailTo property.
     * 
     * @return
     *     possible object is
     *     {@link JPSendMailTo }
     *     
     */
    public JPSendMailTo getSendMailTo() {
        return sendMailTo;
    }

    /**
     * Sets the value of the sendMailTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPSendMailTo }
     *     
     */
    public void setSendMailTo(JPSendMailTo value) {
        this.sendMailTo = value;
    }

    /**
     * Gets the value of the showBreakdownPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowBreakdownPrice() {
        return showBreakdownPrice;
    }

    /**
     * Sets the value of the showBreakdownPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowBreakdownPrice(Boolean value) {
        this.showBreakdownPrice = value;
    }

}
