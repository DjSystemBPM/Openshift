
package com.multiva.ws.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCUSEGETINFOCUSTOMERResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCUSEGETINFOCUSTOMERResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://temenos.com/T24.TWS.CUSTOMER}Status" minOccurs="0"/>
 *         &lt;element name="BMVTWSEINFOGRALCLIENTEType" type="{http://temenos.com/T24.TWS.CUSTOMER}BMVTWSEINFOGRALCLIENTEType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCUSEGETINFOCUSTOMERResponse", propOrder = {
    "status",
    "bmvtwseinfogralclienteType"
})
public class WSCUSEGETINFOCUSTOMERResponse {

    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "BMVTWSEINFOGRALCLIENTEType")
    protected List<BMVTWSEINFOGRALCLIENTEType> bmvtwseinfogralclienteType;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the bmvtwseinfogralclienteType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bmvtwseinfogralclienteType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBMVTWSEINFOGRALCLIENTEType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BMVTWSEINFOGRALCLIENTEType }
     * 
     * 
     */
    public List<BMVTWSEINFOGRALCLIENTEType> getBMVTWSEINFOGRALCLIENTEType() {
        if (bmvtwseinfogralclienteType == null) {
            bmvtwseinfogralclienteType = new ArrayList<BMVTWSEINFOGRALCLIENTEType>();
        }
        return this.bmvtwseinfogralclienteType;
    }

}
