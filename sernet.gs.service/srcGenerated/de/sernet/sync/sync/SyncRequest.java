//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 04:42:22 PM CET 
//


package de.sernet.sync.sync;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import de.sernet.sync.data.SyncData;
import de.sernet.sync.mapping.SyncMapping;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sernet.de/sync/data}syncData"/>
 *         &lt;element ref="{http://www.sernet.de/sync/mapping}syncMapping"/>
 *         &lt;element name="syncVnaSchemaVersion">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="compatibleVersions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="vnaSchemaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="sourceId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="insert" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="update" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="delete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "syncData",
    "syncMapping",
    "syncVnaSchemaVersion"
})
@XmlRootElement(name = "syncRequest", namespace = "http://www.sernet.de/sync/sync")
public class SyncRequest {

    @XmlElement(required = true)
    protected SyncData syncData;
    @XmlElement(namespace = "http://www.sernet.de/sync/mapping", required = true)
    protected SyncMapping syncMapping;
    @XmlElement(namespace = "http://www.sernet.de/sync/sync", required = true)
    protected SyncRequest.SyncVnaSchemaVersion syncVnaSchemaVersion;
    @XmlAttribute(name = "sourceId", required = true)
    protected String sourceId;
    @XmlAttribute(name = "insert")
    protected Boolean insert;
    @XmlAttribute(name = "update")
    protected Boolean update;
    @XmlAttribute(name = "delete")
    protected Boolean delete;

    /**
     * Gets the value of the syncData property.
     * 
     * @return
     *     possible object is
     *     {@link SyncData }
     *     
     */
    public SyncData getSyncData() {
        return syncData;
    }

    /**
     * Sets the value of the syncData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncData }
     *     
     */
    public void setSyncData(SyncData value) {
        this.syncData = value;
    }

    /**
     * Gets the value of the syncMapping property.
     * 
     * @return
     *     possible object is
     *     {@link SyncMapping }
     *     
     */
    public SyncMapping getSyncMapping() {
        return syncMapping;
    }

    /**
     * Sets the value of the syncMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncMapping }
     *     
     */
    public void setSyncMapping(SyncMapping value) {
        this.syncMapping = value;
    }

    /**
     * Gets the value of the syncVnaSchemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link SyncRequest.SyncVnaSchemaVersion }
     *     
     */
    public SyncRequest.SyncVnaSchemaVersion getSyncVnaSchemaVersion() {
        return syncVnaSchemaVersion;
    }

    /**
     * Sets the value of the syncVnaSchemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncRequest.SyncVnaSchemaVersion }
     *     
     */
    public void setSyncVnaSchemaVersion(SyncRequest.SyncVnaSchemaVersion value) {
        this.syncVnaSchemaVersion = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceId(String value) {
        this.sourceId = value;
    }

    /**
     * Gets the value of the insert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInsert() {
        if (insert == null) {
            return true;
        } else {
            return insert;
        }
    }

    /**
     * Sets the value of the insert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsert(Boolean value) {
        this.insert = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUpdate() {
        if (update == null) {
            return true;
        } else {
            return update;
        }
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdate(Boolean value) {
        this.update = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDelete() {
        if (delete == null) {
            return false;
        } else {
            return delete;
        }
    }

    /**
     * Sets the value of the delete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="compatibleVersions" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *       &lt;attribute name="vnaSchemaVersion" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "compatibleVersions"
    })
    public static class SyncVnaSchemaVersion {

        @XmlElement(namespace = "http://www.sernet.de/sync/sync", required = true)
        protected List<String> compatibleVersions;
        @XmlAttribute(name = "vnaSchemaVersion", required = true)
        protected String vnaSchemaVersion;

        /**
         * Gets the value of the compatibleVersions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compatibleVersions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompatibleVersions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCompatibleVersions() {
            if (compatibleVersions == null) {
                compatibleVersions = new ArrayList<String>();
            }
            return this.compatibleVersions;
        }

        /**
         * Gets the value of the vnaSchemaVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVnaSchemaVersion() {
            return vnaSchemaVersion;
        }

        /**
         * Sets the value of the vnaSchemaVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVnaSchemaVersion(String value) {
            this.vnaSchemaVersion = value;
        }

    }

}