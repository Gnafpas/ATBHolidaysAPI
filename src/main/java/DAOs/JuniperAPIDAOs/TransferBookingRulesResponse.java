
package DAOs.JuniperAPIDAOs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingRulesRS" type="{http://www.juniper.es/webservice/2007/}JP_BookingRulesRS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingRulesRS"
})
@XmlRootElement(name = "TransferBookingRulesResponse")
public class TransferBookingRulesResponse {

    @XmlElement(name = "BookingRulesRS")
    protected JPBookingRulesRS bookingRulesRS;

    /**
     * Gets the value of the bookingRulesRS property.
     * 
     * @return
     *     possible object is
     *     {@link JPBookingRulesRS }
     *     
     */
    public JPBookingRulesRS getBookingRulesRS() {
        return bookingRulesRS;
    }

    /**
     * Sets the value of the bookingRulesRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPBookingRulesRS }
     *     
     */
    public void setBookingRulesRS(JPBookingRulesRS value) {
        this.bookingRulesRS = value;
    }

}
