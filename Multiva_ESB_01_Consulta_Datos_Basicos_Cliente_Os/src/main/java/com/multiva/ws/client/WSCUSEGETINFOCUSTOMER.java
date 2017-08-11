
package com.multiva.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCUSEGETINFOCUSTOMER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCUSEGETINFOCUSTOMER">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WebRequestCommon" type="{http://temenos.com/T24.TWS.CUSTOMER}webRequestCommon"/>
 *         &lt;element name="BMVTWSEINFOGRALCLIENTEType" type="{http://temenos.com/T24.TWS.CUSTOMER}enquiryInput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSCUSEGETINFOCUSTOMER", propOrder = {
    "webRequestCommon",
    "bmvtwseinfogralclienteType"
})
public class WSCUSEGETINFOCUSTOMER {

    @XmlElement(name = "WebRequestCommon", required = true)
    protected WebRequestCommon webRequestCommon;
    @XmlElement(name = "BMVTWSEINFOGRALCLIENTEType", required = true)
    protected EnquiryInput bmvtwseinfogralclienteType;

    /**
     * Gets the value of the webRequestCommon property.
     * 
     * @return
     *     possible object is
     *     {@link WebRequestCommon }
     *     
     */
    public WebRequestCommon getWebRequestCommon() {
        return webRequestCommon;
    }

    /**
     * Sets the value of the webRequestCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebRequestCommon }
     *     
     */
    public void setWebRequestCommon(WebRequestCommon value) {
        this.webRequestCommon = value;
    }

    /**
     * Gets the value of the bmvtwseinfogralclienteType property.
     * 
     * @return
     *     possible object is
     *     {@link EnquiryInput }
     *     
     */
    public EnquiryInput getBMVTWSEINFOGRALCLIENTEType() {
        return bmvtwseinfogralclienteType;
    }

    /**
     * Sets the value of the bmvtwseinfogralclienteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnquiryInput }
     *     
     */
    public void setBMVTWSEINFOGRALCLIENTEType(EnquiryInput value) {
        this.bmvtwseinfogralclienteType = value;
    }

}
