//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.09 a las 01:30:31 AM CDT 
//


package https.theksquaregroup_com.xml.contact;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Contact complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="heroName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="superPower" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="img" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "name",
    "lastName",
    "heroName",
    "requestDescription",
    "age",
    "superPower",
    "img"
})
public class Contact {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String heroName;
    @XmlElement(required = true)
    protected String requestDescription;
    protected int age;
    @XmlElement(required = true)
    protected String superPower;
    @XmlElement(required = true)
    protected String img;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad heroName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeroName() {
        return heroName;
    }

    /**
     * Define el valor de la propiedad heroName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeroName(String value) {
        this.heroName = value;
    }

    /**
     * Obtiene el valor de la propiedad requestDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestDescription() {
        return requestDescription;
    }

    /**
     * Define el valor de la propiedad requestDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestDescription(String value) {
        this.requestDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad age.
     * 
     */
    public int getAge() {
        return age;
    }

    /**
     * Define el valor de la propiedad age.
     * 
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Obtiene el valor de la propiedad superPower.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuperPower() {
        return superPower;
    }

    /**
     * Define el valor de la propiedad superPower.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuperPower(String value) {
        this.superPower = value;
    }

    /**
     * Obtiene el valor de la propiedad img.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImg() {
        return img;
    }

    /**
     * Define el valor de la propiedad img.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImg(String value) {
        this.img = value;
    }

}
