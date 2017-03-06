
package br.com.fnis.xmlns.consultaacoesatendimento.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MotivoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MotivoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="seqAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dsSeqAcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MotivoType", propOrder = {
    "seqAcao",
    "dsSeqAcao"
})
public class MotivoType {

    protected String seqAcao;
    protected String dsSeqAcao;

    /**
     * Gets the value of the seqAcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqAcao() {
        return seqAcao;
    }

    /**
     * Sets the value of the seqAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqAcao(String value) {
        this.seqAcao = value;
    }

    /**
     * Gets the value of the dsSeqAcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsSeqAcao() {
        return dsSeqAcao;
    }

    /**
     * Sets the value of the dsSeqAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsSeqAcao(String value) {
        this.dsSeqAcao = value;
    }

}
