
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
 *         &lt;element name="CheckPaymentRS" type="{http://www.juniper.es/webservice/2007/}JP_CheckPaymentRS" minOccurs="0"/>
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
    "checkPaymentRS"
})
@XmlRootElement(name = "CheckPaymentResponse")
public class CheckPaymentResponse {

    @XmlElement(name = "CheckPaymentRS")
    protected JPCheckPaymentRS checkPaymentRS;

    /**
     * Gets the value of the checkPaymentRS property.
     * 
     * @return
     *     possible object is
     *     {@link JPCheckPaymentRS }
     *     
     */
    public JPCheckPaymentRS getCheckPaymentRS() {
        return checkPaymentRS;
    }

    /**
     * Sets the value of the checkPaymentRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPCheckPaymentRS }
     *     
     */
    public void setCheckPaymentRS(JPCheckPaymentRS value) {
        this.checkPaymentRS = value;
    }

}
