//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.09 a las 01:30:31 AM CDT 
//


package https.theksquaregroup_com.xml.contact;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.theksquaregroup_com.xml.contact package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.theksquaregroup_com.xml.contact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContactDetailsResponse }
     * 
     */
    public ContactDetailsResponse createContactDetailsResponse() {
        return new ContactDetailsResponse();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link ContactDetailsRequest }
     * 
     */
    public ContactDetailsRequest createContactDetailsRequest() {
        return new ContactDetailsRequest();
    }

}
