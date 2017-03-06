
package br.com.fnis.xmlns.consultaacoesatendimento.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ConsultarAcoesAtendimentoResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarAcoesAtendimentoResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="dsAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tpAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dsTipoAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dsStatusAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListaMotivo" type="{http://xmlns.fnis.com.br/consultaAcoesAtendimento/V1.xsd}ListaMotivoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarAcoesAtendimentoResponseType", propOrder = {
    "responseDate",
    "dsAcao",
    "tpAcao",
    "dsTipoAcao",
    "stAcao",
    "dsStatusAcao",
    "listaMotivo"
})
public class ConsultarAcoesAtendimentoResponseType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDate;
    protected String dsAcao;
    protected String tpAcao;
    protected String dsTipoAcao;
    protected String stAcao;
    protected String dsStatusAcao;
    @XmlElement(name = "ListaMotivo")
    protected ListaMotivoType listaMotivo;
    @XmlAttribute(name = "UUID")
    protected String uuid;

    /**
     * Gets the value of the responseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDate() {
        return responseDate;
    }

    /**
     * Sets the value of the responseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDate(XMLGregorianCalendar value) {
        this.responseDate = value;
    }

    /**
     * Gets the value of the dsAcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsAcao() {
        return dsAcao;
    }

    /**
     * Sets the value of the dsAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsAcao(String value) {
        this.dsAcao = value;
    }

    /**
     * Gets the value of the tpAcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAcao() {
        return tpAcao;
    }

    /**
     * Sets the value of the tpAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAcao(String value) {
        this.tpAcao = value;
    }

    /**
     * Gets the value of the dsTipoAcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsTipoAcao() {
        return dsTipoAcao;
    }

    /**
     * Sets the value of the dsTipoAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsTipoAcao(String value) {
        this.dsTipoAcao = value;
    }

    /**
     * Gets the value of the stAcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStAcao() {
        return stAcao;
    }

    /**
     * Sets the value of the stAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStAcao(String value) {
        this.stAcao = value;
    }

    /**
     * Gets the value of the dsStatusAcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsStatusAcao() {
        return dsStatusAcao;
    }

    /**
     * Sets the value of the dsStatusAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsStatusAcao(String value) {
        this.dsStatusAcao = value;
    }

    /**
     * Gets the value of the listaMotivo property.
     * 
     * @return
     *     possible object is
     *     {@link ListaMotivoType }
     *     
     */
    public ListaMotivoType getListaMotivo() {
        return listaMotivo;
    }

    /**
     * Sets the value of the listaMotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaMotivoType }
     *     
     */
    public void setListaMotivo(ListaMotivoType value) {
        this.listaMotivo = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

}
