
package com.multiva.ws.client;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMVTWSEINFOGRALCLIENTEType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMVTWSEINFOGRALCLIENTEType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gBMVTWSEINFOGRALCLIENTEDetailType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mBMVTWSEINFOGRALCLIENTEDetailType" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="NoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ApPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ApMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FecNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LugNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NumInterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CvePaisTelDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodAreaTelDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TelDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CvePaisTelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodAreaTelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CvePaisTelCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodAreaTelCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TelCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CodigoPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="NombrePromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="VIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IdSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMVTWSEINFOGRALCLIENTEType", propOrder = {
    "gbmvtwseinfogralclienteDetailType"
})
public class BMVTWSEINFOGRALCLIENTEType {

    @XmlElement(name = "gBMVTWSEINFOGRALCLIENTEDetailType")
    protected BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType gbmvtwseinfogralclienteDetailType;

    /**
     * Gets the value of the gbmvtwseinfogralclienteDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType }
     *     
     */
    public BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType getGBMVTWSEINFOGRALCLIENTEDetailType() {
        return gbmvtwseinfogralclienteDetailType;
    }

    /**
     * Sets the value of the gbmvtwseinfogralclienteDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType }
     *     
     */
    public void setGBMVTWSEINFOGRALCLIENTEDetailType(BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType value) {
        this.gbmvtwseinfogralclienteDetailType = value;
    }


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
     *         &lt;element name="mBMVTWSEINFOGRALCLIENTEDetailType" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="NoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ApPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ApMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FecNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LugNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NumInterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CvePaisTelDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodAreaTelDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TelDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CvePaisTelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodAreaTelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CvePaisTelCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodAreaTelCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TelCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CodigoPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="NombrePromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="VIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IdSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="g" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mbmvtwseinfogralclienteDetailType"
    })
    public static class GBMVTWSEINFOGRALCLIENTEDetailType {

        @XmlElement(name = "mBMVTWSEINFOGRALCLIENTEDetailType")
        protected List<BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType> mbmvtwseinfogralclienteDetailType;
        @XmlAttribute(name = "g")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger g;

        /**
         * Gets the value of the mbmvtwseinfogralclienteDetailType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mbmvtwseinfogralclienteDetailType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMBMVTWSEINFOGRALCLIENTEDetailType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType }
         * 
         * 
         */
        public List<BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType> getMBMVTWSEINFOGRALCLIENTEDetailType() {
            if (mbmvtwseinfogralclienteDetailType == null) {
                mbmvtwseinfogralclienteDetailType = new ArrayList<BMVTWSEINFOGRALCLIENTEType.GBMVTWSEINFOGRALCLIENTEDetailType.MBMVTWSEINFOGRALCLIENTEDetailType>();
            }
            return this.mbmvtwseinfogralclienteDetailType;
        }

        /**
         * Gets the value of the g property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getG() {
            return g;
        }

        /**
         * Sets the value of the g property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setG(BigInteger value) {
            this.g = value;
        }


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
         *         &lt;element name="NoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ApPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ApMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FecNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LugNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumExterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NumInterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Colonia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CvePaisTelDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodAreaTelDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TelDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CvePaisTelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodAreaTelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TelOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CvePaisTelCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodAreaTelCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TelCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CodigoPromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="NombrePromotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="VIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IdSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="m" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "noCliente",
            "apPaterno",
            "apMaterno",
            "nombre",
            "fecNacimiento",
            "rfc",
            "lugNacimiento",
            "calle",
            "numExterior",
            "numInterior",
            "colonia",
            "municipio",
            "codigoPostal",
            "estado",
            "ciudad",
            "pais",
            "cvePaisTelDomicilio",
            "codAreaTelDomicilio",
            "telDomicilio",
            "cvePaisTelOficina",
            "codAreaTelOficina",
            "telOficina",
            "cvePaisTelCelular",
            "codAreaTelCelular",
            "telCelular",
            "email",
            "tipoPersona",
            "codigoPromotor",
            "nombrePromotor",
            "vip",
            "idSucursal",
            "sucursal"
        })
        public static class MBMVTWSEINFOGRALCLIENTEDetailType {

            @XmlElementRef(name = "NoCliente", type = JAXBElement.class, required = false)
            protected JAXBElement<String> noCliente;
            @XmlElementRef(name = "ApPaterno", type = JAXBElement.class, required = false)
            protected JAXBElement<String> apPaterno;
            @XmlElementRef(name = "ApMaterno", type = JAXBElement.class, required = false)
            protected JAXBElement<String> apMaterno;
            @XmlElementRef(name = "Nombre", type = JAXBElement.class, required = false)
            protected JAXBElement<String> nombre;
            @XmlElementRef(name = "FecNacimiento", type = JAXBElement.class, required = false)
            protected JAXBElement<String> fecNacimiento;
            @XmlElementRef(name = "RFC", type = JAXBElement.class, required = false)
            protected JAXBElement<String> rfc;
            @XmlElementRef(name = "LugNacimiento", type = JAXBElement.class, required = false)
            protected JAXBElement<String> lugNacimiento;
            @XmlElementRef(name = "Calle", type = JAXBElement.class, required = false)
            protected JAXBElement<String> calle;
            @XmlElementRef(name = "NumExterior", type = JAXBElement.class, required = false)
            protected JAXBElement<String> numExterior;
            @XmlElementRef(name = "NumInterior", type = JAXBElement.class, required = false)
            protected JAXBElement<String> numInterior;
            @XmlElementRef(name = "Colonia", type = JAXBElement.class, required = false)
            protected JAXBElement<String> colonia;
            @XmlElementRef(name = "Municipio", type = JAXBElement.class, required = false)
            protected JAXBElement<String> municipio;
            @XmlElementRef(name = "CodigoPostal", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codigoPostal;
            @XmlElementRef(name = "Estado", type = JAXBElement.class, required = false)
            protected JAXBElement<String> estado;
            @XmlElementRef(name = "Ciudad", type = JAXBElement.class, required = false)
            protected JAXBElement<String> ciudad;
            @XmlElementRef(name = "Pais", type = JAXBElement.class, required = false)
            protected JAXBElement<String> pais;
            @XmlElementRef(name = "CvePaisTelDomicilio", type = JAXBElement.class, required = false)
            protected JAXBElement<String> cvePaisTelDomicilio;
            @XmlElementRef(name = "CodAreaTelDomicilio", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codAreaTelDomicilio;
            @XmlElementRef(name = "TelDomicilio", type = JAXBElement.class, required = false)
            protected JAXBElement<String> telDomicilio;
            @XmlElementRef(name = "CvePaisTelOficina", type = JAXBElement.class, required = false)
            protected JAXBElement<String> cvePaisTelOficina;
            @XmlElementRef(name = "CodAreaTelOficina", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codAreaTelOficina;
            @XmlElementRef(name = "TelOficina", type = JAXBElement.class, required = false)
            protected JAXBElement<String> telOficina;
            @XmlElementRef(name = "CvePaisTelCelular", type = JAXBElement.class, required = false)
            protected JAXBElement<String> cvePaisTelCelular;
            @XmlElementRef(name = "CodAreaTelCelular", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codAreaTelCelular;
            @XmlElementRef(name = "TelCelular", type = JAXBElement.class, required = false)
            protected JAXBElement<String> telCelular;
            @XmlElementRef(name = "Email", type = JAXBElement.class, required = false)
            protected JAXBElement<String> email;
            @XmlElementRef(name = "TipoPersona", type = JAXBElement.class, required = false)
            protected JAXBElement<String> tipoPersona;
            @XmlElementRef(name = "CodigoPromotor", type = JAXBElement.class, required = false)
            protected JAXBElement<String> codigoPromotor;
            @XmlElementRef(name = "NombrePromotor", type = JAXBElement.class, required = false)
            protected JAXBElement<String> nombrePromotor;
            @XmlElementRef(name = "VIP", type = JAXBElement.class, required = false)
            protected JAXBElement<String> vip;
            @XmlElementRef(name = "IdSucursal", type = JAXBElement.class, required = false)
            protected JAXBElement<String> idSucursal;
            @XmlElementRef(name = "Sucursal", type = JAXBElement.class, required = false)
            protected JAXBElement<String> sucursal;
            @XmlAttribute(name = "m")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger m;

            /**
             * Gets the value of the noCliente property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getNoCliente() {
                return noCliente;
            }

            /**
             * Sets the value of the noCliente property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setNoCliente(JAXBElement<String> value) {
                this.noCliente = value;
            }

            /**
             * Gets the value of the apPaterno property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getApPaterno() {
                return apPaterno;
            }

            /**
             * Sets the value of the apPaterno property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setApPaterno(JAXBElement<String> value) {
                this.apPaterno = value;
            }

            /**
             * Gets the value of the apMaterno property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getApMaterno() {
                return apMaterno;
            }

            /**
             * Sets the value of the apMaterno property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setApMaterno(JAXBElement<String> value) {
                this.apMaterno = value;
            }

            /**
             * Gets the value of the nombre property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getNombre() {
                return nombre;
            }

            /**
             * Sets the value of the nombre property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setNombre(JAXBElement<String> value) {
                this.nombre = value;
            }

            /**
             * Gets the value of the fecNacimiento property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getFecNacimiento() {
                return fecNacimiento;
            }

            /**
             * Sets the value of the fecNacimiento property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setFecNacimiento(JAXBElement<String> value) {
                this.fecNacimiento = value;
            }

            /**
             * Gets the value of the rfc property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getRFC() {
                return rfc;
            }

            /**
             * Sets the value of the rfc property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setRFC(JAXBElement<String> value) {
                this.rfc = value;
            }

            /**
             * Gets the value of the lugNacimiento property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getLugNacimiento() {
                return lugNacimiento;
            }

            /**
             * Sets the value of the lugNacimiento property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setLugNacimiento(JAXBElement<String> value) {
                this.lugNacimiento = value;
            }

            /**
             * Gets the value of the calle property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCalle() {
                return calle;
            }

            /**
             * Sets the value of the calle property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCalle(JAXBElement<String> value) {
                this.calle = value;
            }

            /**
             * Gets the value of the numExterior property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getNumExterior() {
                return numExterior;
            }

            /**
             * Sets the value of the numExterior property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setNumExterior(JAXBElement<String> value) {
                this.numExterior = value;
            }

            /**
             * Gets the value of the numInterior property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getNumInterior() {
                return numInterior;
            }

            /**
             * Sets the value of the numInterior property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setNumInterior(JAXBElement<String> value) {
                this.numInterior = value;
            }

            /**
             * Gets the value of the colonia property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getColonia() {
                return colonia;
            }

            /**
             * Sets the value of the colonia property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setColonia(JAXBElement<String> value) {
                this.colonia = value;
            }

            /**
             * Gets the value of the municipio property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getMunicipio() {
                return municipio;
            }

            /**
             * Sets the value of the municipio property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setMunicipio(JAXBElement<String> value) {
                this.municipio = value;
            }

            /**
             * Gets the value of the codigoPostal property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodigoPostal() {
                return codigoPostal;
            }

            /**
             * Sets the value of the codigoPostal property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodigoPostal(JAXBElement<String> value) {
                this.codigoPostal = value;
            }

            /**
             * Gets the value of the estado property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getEstado() {
                return estado;
            }

            /**
             * Sets the value of the estado property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setEstado(JAXBElement<String> value) {
                this.estado = value;
            }

            /**
             * Gets the value of the ciudad property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCiudad() {
                return ciudad;
            }

            /**
             * Sets the value of the ciudad property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCiudad(JAXBElement<String> value) {
                this.ciudad = value;
            }

            /**
             * Gets the value of the pais property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getPais() {
                return pais;
            }

            /**
             * Sets the value of the pais property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setPais(JAXBElement<String> value) {
                this.pais = value;
            }

            /**
             * Gets the value of the cvePaisTelDomicilio property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCvePaisTelDomicilio() {
                return cvePaisTelDomicilio;
            }

            /**
             * Sets the value of the cvePaisTelDomicilio property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCvePaisTelDomicilio(JAXBElement<String> value) {
                this.cvePaisTelDomicilio = value;
            }

            /**
             * Gets the value of the codAreaTelDomicilio property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodAreaTelDomicilio() {
                return codAreaTelDomicilio;
            }

            /**
             * Sets the value of the codAreaTelDomicilio property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodAreaTelDomicilio(JAXBElement<String> value) {
                this.codAreaTelDomicilio = value;
            }

            /**
             * Gets the value of the telDomicilio property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTelDomicilio() {
                return telDomicilio;
            }

            /**
             * Sets the value of the telDomicilio property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTelDomicilio(JAXBElement<String> value) {
                this.telDomicilio = value;
            }

            /**
             * Gets the value of the cvePaisTelOficina property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCvePaisTelOficina() {
                return cvePaisTelOficina;
            }

            /**
             * Sets the value of the cvePaisTelOficina property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCvePaisTelOficina(JAXBElement<String> value) {
                this.cvePaisTelOficina = value;
            }

            /**
             * Gets the value of the codAreaTelOficina property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodAreaTelOficina() {
                return codAreaTelOficina;
            }

            /**
             * Sets the value of the codAreaTelOficina property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodAreaTelOficina(JAXBElement<String> value) {
                this.codAreaTelOficina = value;
            }

            /**
             * Gets the value of the telOficina property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTelOficina() {
                return telOficina;
            }

            /**
             * Sets the value of the telOficina property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTelOficina(JAXBElement<String> value) {
                this.telOficina = value;
            }

            /**
             * Gets the value of the cvePaisTelCelular property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCvePaisTelCelular() {
                return cvePaisTelCelular;
            }

            /**
             * Sets the value of the cvePaisTelCelular property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCvePaisTelCelular(JAXBElement<String> value) {
                this.cvePaisTelCelular = value;
            }

            /**
             * Gets the value of the codAreaTelCelular property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodAreaTelCelular() {
                return codAreaTelCelular;
            }

            /**
             * Sets the value of the codAreaTelCelular property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodAreaTelCelular(JAXBElement<String> value) {
                this.codAreaTelCelular = value;
            }

            /**
             * Gets the value of the telCelular property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTelCelular() {
                return telCelular;
            }

            /**
             * Sets the value of the telCelular property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTelCelular(JAXBElement<String> value) {
                this.telCelular = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setEmail(JAXBElement<String> value) {
                this.email = value;
            }

            /**
             * Gets the value of the tipoPersona property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getTipoPersona() {
                return tipoPersona;
            }

            /**
             * Sets the value of the tipoPersona property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setTipoPersona(JAXBElement<String> value) {
                this.tipoPersona = value;
            }

            /**
             * Gets the value of the codigoPromotor property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getCodigoPromotor() {
                return codigoPromotor;
            }

            /**
             * Sets the value of the codigoPromotor property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setCodigoPromotor(JAXBElement<String> value) {
                this.codigoPromotor = value;
            }

            /**
             * Gets the value of the nombrePromotor property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getNombrePromotor() {
                return nombrePromotor;
            }

            /**
             * Sets the value of the nombrePromotor property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setNombrePromotor(JAXBElement<String> value) {
                this.nombrePromotor = value;
            }

            /**
             * Gets the value of the vip property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getVIP() {
                return vip;
            }

            /**
             * Sets the value of the vip property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setVIP(JAXBElement<String> value) {
                this.vip = value;
            }

            /**
             * Gets the value of the idSucursal property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getIdSucursal() {
                return idSucursal;
            }

            /**
             * Sets the value of the idSucursal property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setIdSucursal(JAXBElement<String> value) {
                this.idSucursal = value;
            }

            /**
             * Gets the value of the sucursal property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public JAXBElement<String> getSucursal() {
                return sucursal;
            }

            /**
             * Sets the value of the sucursal property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link String }{@code >}
             *     
             */
            public void setSucursal(JAXBElement<String> value) {
                this.sucursal = value;
            }

            /**
             * Gets the value of the m property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getM() {
                return m;
            }

            /**
             * Sets the value of the m property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setM(BigInteger value) {
                this.m = value;
            }

        }

    }

}
