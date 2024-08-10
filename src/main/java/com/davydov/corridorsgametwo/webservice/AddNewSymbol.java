
package com.davydov.corridorsgametwo.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addNewSymbol complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addNewSymbol"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="playerSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="columnIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rowIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addNewSymbol", propOrder = {
    "playerSymbol",
    "columnIndex",
    "rowIndex"
})
public class AddNewSymbol {

    protected String playerSymbol;
    protected Integer columnIndex;
    protected Integer rowIndex;

    /**
     * Gets the value of the playerSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerSymbol() {
        return playerSymbol;
    }

    /**
     * Sets the value of the playerSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerSymbol(String value) {
        this.playerSymbol = value;
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

}
