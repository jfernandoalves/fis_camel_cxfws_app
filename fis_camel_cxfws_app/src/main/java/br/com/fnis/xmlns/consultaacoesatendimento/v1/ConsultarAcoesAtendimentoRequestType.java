
package br.com.fnis.xmlns.consultaacoesatendimento.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.fnis.xmlns.commons.v1.ServiceIdentificationType;


/**
 * <p>Java class for ConsultarAcoesAtendimentoRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarAcoesAtendimentoRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://xmlns.fnis.com.br/Commons/V1}ServiceIdentification"/&gt;
 *         &lt;element name="cdAcao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nmOrigem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarAcoesAtendimentoRequestType", propOrder = {
    "serviceIdentification",
    "cdAcao",
    "nmOrigem"
})
public class ConsultarAcoesAtendimentoRequestType {

    @XmlElement(name = "ServiceIdentification", namespace = "http://xmlns.fnis.com.br/Commons/V1", required = true)
    protected ServiceIdentificationType serviceIdentification;
    @XmlElement(required = true)
    protected String cdAcao;
    @XmlElement(required = true)
    protected String nmOrigem;

    /**
     * Gets the value of the serviceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceIdentificationType }
     *     
     */
    public ServiceIdentificationType getServiceIdentification() {
        return serviceIdentification;
    }

    /**
     * Sets the value of the serviceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceIdentificationType }
     *     
     */
    public void setServiceIdentification(ServiceIdentificationType value) {
        this.serviceIdentification = value;
    }

    /**
     * Gets the value of the cdAcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdAcao() {
        return cdAcao;
    }

    /**
     * Sets the value of the cdAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdAcao(String value) {
        this.cdAcao = value;
    }

    /**
     * Gets the value of the nmOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmOrigem() {
        return nmOrigem;
    }

    /**
     * Sets the value of the nmOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmOrigem(String value) {
        this.nmOrigem = value;
    }

}
