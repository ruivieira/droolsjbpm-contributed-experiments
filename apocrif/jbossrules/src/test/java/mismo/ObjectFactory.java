//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.05.15 at 02:31:11 PM BST 
//

package mismo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.mismo.test package. 
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

    private final static QName _Root_QNAME = new QName( "mismo",
                                                        "root" );

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.mismo.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditScore }
     * 
     */
    public CreditScore createCreditScore() {
        return new CreditScore();
    }

    /**
     * Create an instance of {@link Root }
     * 
     */
    public Root createRoot() {
        return new Root();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Root }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "mismo", name = "root")
    public JAXBElement<Root> createRoot(Root value) {
        return new JAXBElement<Root>( _Root_QNAME,
                                      Root.class,
                                      null,
                                      value );
    }

}
