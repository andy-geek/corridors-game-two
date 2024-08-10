
package com.davydov.corridorsgametwo.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stopGame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stopGame"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gameStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="winningPlayer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stopGame", propOrder = {
    "gameStatus",
    "winningPlayer"
})
public class StopGame {

    protected Boolean gameStatus;
    protected String winningPlayer;

    /**
     * Gets the value of the gameStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGameStatus() {
        return gameStatus;
    }

    /**
     * Sets the value of the gameStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGameStatus(Boolean value) {
        this.gameStatus = value;
    }

    /**
     * Gets the value of the winningPlayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinningPlayer() {
        return winningPlayer;
    }

    /**
     * Sets the value of the winningPlayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinningPlayer(String value) {
        this.winningPlayer = value;
    }

}
