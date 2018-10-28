
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
 *         &lt;element name="HotelModifyRQ" type="{http://www.juniper.es/webservice/2007/}JP_HotelModify" minOccurs="0"/>
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
    "hotelModifyRQ"
})
@XmlRootElement(name = "HotelModify")
public class HotelModify {

    @XmlElement(name = "HotelModifyRQ")
    protected JPHotelModify hotelModifyRQ;

    /**
     * Gets the value of the hotelModifyRQ property.
     * 
     * @return
     *     possible object is
     *     {@link JPHotelModify }
     *     
     */
    public JPHotelModify getHotelModifyRQ() {
        return hotelModifyRQ;
    }

    /**
     * Sets the value of the hotelModifyRQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JPHotelModify }
     *     
     */
    public void setHotelModifyRQ(JPHotelModify value) {
        this.hotelModifyRQ = value;
    }

}
