
package com.davydov.corridorsgametwo.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addNewBorder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addNewBorder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="borderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="columnIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rowIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="playerMove" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addNewBorder", propOrder = {
    "borderType",
    "columnIndex",
    "rowIndex",
    "playerMove"
})
public class AddNewBorder {

    protected String borderType;
    protected Integer columnIndex;
    protected Integer rowIndex;
    protected String playerMove;

    /**
     * Gets the value of the borderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderType() {
        return borderType;
    }

    /**
     * Sets the value of the borderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderType(String value) {
        this.borderType = value;
    }

    /**
     * Gets the value of the columnIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColumnIndex() {
        return columnIndex;
    }

    /**
     * Sets the value of the columnIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColumnIndex(Integer value) {
        this.columnIndex = value;
    }

    /**
     * Gets the value of the rowIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowIndex() {
        return rowIndex;
    }

    /**
     * Sets the value of the rowIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowIndex(Integer value) {
        this.rowIndex = value;
    }

    /**
     * Gets the value of the playerMove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerMove() {
        return playerMove;
    }

    /**
     * Sets the value of the playerMove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerMove(String value) {
        this.playerMove = value;
    }

}
