
package br.com.fnis.xmlns.consultaacoesatendimento.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fnis.xmlns.consultaacoesatendimento.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarAcoesAtendimentoRequest_QNAME = new QName("http://xmlns.fnis.com.br/consultaAcoesAtendimento/V1.xsd", "ConsultarAcoesAtendimentoRequest");
    private final static QName _ConsultarAcoesAtendimentoResponse_QNAME = new QName("http://xmlns.fnis.com.br/consultaAcoesAtendimento/V1.xsd", "ConsultarAcoesAtendimentoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fnis.xmlns.consultaacoesatendimento.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarAcoesAtendimentoRequestType }
     * 
     */
    public ConsultarAcoesAtendimentoRequestType createConsultarAcoesAtendimentoRequestType() {
        return new ConsultarAcoesAtendimentoRequestType();
    }

    /**
     * Create an instance of {@link ConsultarAcoesAtendimentoResponseType }
     * 
     */
    public ConsultarAcoesAtendimentoResponseType createConsultarAcoesAtendimentoResponseType() {
        return new ConsultarAcoesAtendimentoResponseType();
    }

    /**
     * Create an instance of {@link ListaMotivoType }
     * 
     */
    public ListaMotivoType createListaMotivoType() {
        return new ListaMotivoType();
    }

    /**
     * Create an instance of {@link MotivoType }
     * 
     */
    public MotivoType createMotivoType() {
        return new MotivoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarAcoesAtendimentoRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.fnis.com.br/consultaAcoesAtendimento/V1.xsd", name = "ConsultarAcoesAtendimentoRequest")
    public JAXBElement<ConsultarAcoesAtendimentoRequestType> createConsultarAcoesAtendimentoRequest(ConsultarAcoesAtendimentoRequestType value) {
        return new JAXBElement<ConsultarAcoesAtendimentoRequestType>(_ConsultarAcoesAtendimentoRequest_QNAME, ConsultarAcoesAtendimentoRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarAcoesAtendimentoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.fnis.com.br/consultaAcoesAtendimento/V1.xsd", name = "ConsultarAcoesAtendimentoResponse")
    public JAXBElement<ConsultarAcoesAtendimentoResponseType> createConsultarAcoesAtendimentoResponse(ConsultarAcoesAtendimentoResponseType value) {
        return new JAXBElement<ConsultarAcoesAtendimentoResponseType>(_ConsultarAcoesAtendimentoResponse_QNAME, ConsultarAcoesAtendimentoResponseType.class, null, value);
    }

}
