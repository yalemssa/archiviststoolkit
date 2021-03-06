//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.2-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.11 at 01:13:59 PM EDT 
//


package org.archiviststoolkit.structure.EAD;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for indexentry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indexentry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="namegrp" type="{urn:isbn:1-931666-22-9}namegrp"/>
 *           &lt;group ref="{urn:isbn:1-931666-22-9}m.access.title"/>
 *         &lt;/choice>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ptrgrp" type="{urn:isbn:1-931666-22-9}ptrgrp"/>
 *           &lt;element name="ptr" type="{urn:isbn:1-931666-22-9}ptr"/>
 *           &lt;element name="ref" type="{urn:isbn:1-931666-22-9}ref"/>
 *         &lt;/choice>
 *         &lt;element name="indexentry" type="{urn:isbn:1-931666-22-9}indexentry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:isbn:1-931666-22-9}a.common"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indexentry", namespace = "urn:isbn:1-931666-22-9", propOrder = {
    "namegrp",
    "corpname",
    "famname",
    "geogname",
    "name",
    "occupation",
    "persname",
    "subject",
    "genreform",
    "function",
    "title",
    "ptrgrp",
    "ptr",
    "ref",
    "indexentry"
})
public class Indexentry {

    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Namegrp namegrp;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Corpname corpname;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Famname famname;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Geogname geogname;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Name name;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Occupation occupation;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Persname persname;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Subject subject;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Genreform genreform;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Function function;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Title title;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Ptrgrp ptrgrp;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Ptr ptr;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected Ref ref;
    @XmlElement(namespace = "urn:isbn:1-931666-22-9")
    protected List<Indexentry> indexentry;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String altrender;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String audience;

    /**
     * Gets the value of the namegrp property.
     * 
     * @return
     *     possible object is
     *     {@link Namegrp }
     *     
     */
    public Namegrp getNamegrp() {
        return namegrp;
    }

    /**
     * Sets the value of the namegrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Namegrp }
     *     
     */
    public void setNamegrp(Namegrp value) {
        this.namegrp = value;
    }

    /**
     * Gets the value of the corpname property.
     * 
     * @return
     *     possible object is
     *     {@link Corpname }
     *     
     */
    public Corpname getCorpname() {
        return corpname;
    }

    /**
     * Sets the value of the corpname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Corpname }
     *     
     */
    public void setCorpname(Corpname value) {
        this.corpname = value;
    }

    /**
     * Gets the value of the famname property.
     * 
     * @return
     *     possible object is
     *     {@link Famname }
     *     
     */
    public Famname getFamname() {
        return famname;
    }

    /**
     * Sets the value of the famname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Famname }
     *     
     */
    public void setFamname(Famname value) {
        this.famname = value;
    }

    /**
     * Gets the value of the geogname property.
     * 
     * @return
     *     possible object is
     *     {@link Geogname }
     *     
     */
    public Geogname getGeogname() {
        return geogname;
    }

    /**
     * Sets the value of the geogname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geogname }
     *     
     */
    public void setGeogname(Geogname value) {
        this.geogname = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setName(Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link Occupation }
     *     
     */
    public Occupation getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Occupation }
     *     
     */
    public void setOccupation(Occupation value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the persname property.
     * 
     * @return
     *     possible object is
     *     {@link Persname }
     *     
     */
    public Persname getPersname() {
        return persname;
    }

    /**
     * Sets the value of the persname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persname }
     *     
     */
    public void setPersname(Persname value) {
        this.persname = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link Subject }
     *     
     */
    public Subject getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subject }
     *     
     */
    public void setSubject(Subject value) {
        this.subject = value;
    }

    /**
     * Gets the value of the genreform property.
     * 
     * @return
     *     possible object is
     *     {@link Genreform }
     *     
     */
    public Genreform getGenreform() {
        return genreform;
    }

    /**
     * Sets the value of the genreform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Genreform }
     *     
     */
    public void setGenreform(Genreform value) {
        this.genreform = value;
    }

    /**
     * Gets the value of the function property.
     * 
     * @return
     *     possible object is
     *     {@link Function }
     *     
     */
    public Function getFunction() {
        return function;
    }

    /**
     * Sets the value of the function property.
     * 
     * @param value
     *     allowed object is
     *     {@link Function }
     *     
     */
    public void setFunction(Function value) {
        this.function = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the ptrgrp property.
     * 
     * @return
     *     possible object is
     *     {@link Ptrgrp }
     *     
     */
    public Ptrgrp getPtrgrp() {
        return ptrgrp;
    }

    /**
     * Sets the value of the ptrgrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ptrgrp }
     *     
     */
    public void setPtrgrp(Ptrgrp value) {
        this.ptrgrp = value;
    }

    /**
     * Gets the value of the ptr property.
     * 
     * @return
     *     possible object is
     *     {@link Ptr }
     *     
     */
    public Ptr getPtr() {
        return ptr;
    }

    /**
     * Sets the value of the ptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ptr }
     *     
     */
    public void setPtr(Ptr value) {
        this.ptr = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Ref }
     *     
     */
    public Ref getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ref }
     *     
     */
    public void setRef(Ref value) {
        this.ref = value;
    }

    /**
     * Gets the value of the indexentry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexentry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexentry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Indexentry }
     * 
     * 
     */
    public List<Indexentry> getIndexentry() {
        if (indexentry == null) {
            indexentry = new ArrayList<Indexentry>();
        }
        return this.indexentry;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the altrender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrender() {
        return altrender;
    }

    /**
     * Sets the value of the altrender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltrender(String value) {
        this.altrender = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

}
