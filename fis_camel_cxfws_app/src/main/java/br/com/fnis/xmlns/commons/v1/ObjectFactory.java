
package br.com.fnis.xmlns.commons.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.fnis.xmlns.commons.v1 package. 
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

    private final static QName _FISFaultService_QNAME = new QName("http://xmlns.fnis.com.br/Commons/V1", "FISFaultService");
    private final static QName _ServiceIdentification_QNAME = new QName("http://xmlns.fnis.com.br/Commons/V1", "ServiceIdentification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.fnis.xmlns.commons.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FISFaultServiceType }
     * 
     */
    public FISFaultServiceType createFISFaultServiceType() {
        return new FISFaultServiceType();
    }

    /**
     * Create an instance of {@link ServiceIdentificationType }
     * 
     */
    public ServiceIdentificationType createServiceIdentificationType() {
        return new ServiceIdentificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FISFaultServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.fnis.com.br/Commons/V1", name = "FISFaultService")
    public JAXBElement<FISFaultServiceType> createFISFaultService(FISFaultServiceType value) {
        return new JAXBElement<FISFaultServiceType>(_FISFaultService_QNAME, FISFaultServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIdentificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.fnis.com.br/Commons/V1", name = "ServiceIdentification")
    public JAXBElement<ServiceIdentificationType> createServiceIdentification(ServiceIdentificationType value) {
        return new JAXBElement<ServiceIdentificationType>(_ServiceIdentification_QNAME, ServiceIdentificationType.class, null, value);
    }

}
