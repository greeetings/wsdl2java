
package com.hp.schemas.sm._7;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.hp.schemas.sm._7.common.MessagesType;


/**
 * &lt;p&gt;Java class for MegaHelpModelType complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MegaHelpModelType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="keys" type="{http://schemas.hp.com/SM/7}MegaHelpKeysType"/&amp;gt;
 *         &amp;lt;element name="instance" type="{http://schemas.hp.com/SM/7}MegaHelpInstanceType"/&amp;gt;
 *         &amp;lt;element name="messages" type="{http://schemas.hp.com/SM/7/Common}MessagesType" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" /&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MegaHelpModelType", propOrder = {
    "keys",
    "instance",
    "messages"
})
public class MegaHelpModelType {

    @XmlElement(required = true)
    protected MegaHelpKeysType keys;
    @XmlElement(required = true)
    protected MegaHelpInstanceType instance;
    protected MessagesType messages;
    @XmlAttribute(name = "query")
    protected String query;

    /**
     * Gets the value of the keys property.
     * 
     * @return
     *     possible object is
     *     {@link MegaHelpKeysType }
     *     
     */
    public MegaHelpKeysType getKeys() {
        return keys;
    }

    /**
     * Sets the value of the keys property.
     * 
     * @param value
     *     allowed object is
     *     {@link MegaHelpKeysType }
     *     
     */
    public void setKeys(MegaHelpKeysType value) {
        this.keys = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * @return
     *     possible object is
     *     {@link MegaHelpInstanceType }
     *     
     */
    public MegaHelpInstanceType getInstance() {
        return instance;
    }

    /**
     * Sets the value of the instance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MegaHelpInstanceType }
     *     
     */
    public void setInstance(MegaHelpInstanceType value) {
        this.instance = value;
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link MessagesType }
     *     
     */
    public MessagesType getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessagesType }
     *     
     */
    public void setMessages(MessagesType value) {
        this.messages = value;
    }

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

}
