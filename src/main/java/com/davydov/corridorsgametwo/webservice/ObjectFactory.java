
package com.davydov.corridorsgametwo.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.davydov.corridorsgametwo.webservice package. 
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

    private final static QName _OnAddNewBorder_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onAddNewBorder");
    private final static QName _OnAddNewBorderResponse_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onAddNewBorderResponse");
    private final static QName _OnAddNewSymbol_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onAddNewSymbol");
    private final static QName _OnAddNewSymbolResponse_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onAddNewSymbolResponse");
    private final static QName _OnCheckEndGame_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onCheckEndGame");
    private final static QName _OnCheckEndGameResponse_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onCheckEndGameResponse");
    private final static QName _OnConnectToGameServer_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onConnectToGameServer");
    private final static QName _OnConnectToGameServerResponse_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onConnectToGameServerResponse");
    private final static QName _OnGetNewBorders_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onGetNewBorders");
    private final static QName _OnGetNewBordersResponse_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onGetNewBordersResponse");
    private final static QName _OnGetNewSymbols_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onGetNewSymbols");
    private final static QName _OnGetNewSymbolsResponse_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onGetNewSymbolsResponse");
    private final static QName _OnGetPlayerMove_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onGetPlayerMove");
    private final static QName _OnGetPlayerMoveResponse_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onGetPlayerMoveResponse");
    private final static QName _OnStartGame_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onStartGame");
    private final static QName _OnStartGameResponse_QNAME = new QName("http://server.corridorsgametwo.davydov.com/", "onStartGameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.davydov.corridorsgametwo.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OnAddNewBorder }
     * 
     */
    public OnAddNewBorder createOnAddNewBorder() {
        return new OnAddNewBorder();
    }

    /**
     * Create an instance of {@link OnAddNewBorderResponse }
     * 
     */
    public OnAddNewBorderResponse createOnAddNewBorderResponse() {
        return new OnAddNewBorderResponse();
    }

    /**
     * Create an instance of {@link OnAddNewSymbol }
     * 
     */
    public OnAddNewSymbol createOnAddNewSymbol() {
        return new OnAddNewSymbol();
    }

    /**
     * Create an instance of {@link OnAddNewSymbolResponse }
     * 
     */
    public OnAddNewSymbolResponse createOnAddNewSymbolResponse() {
        return new OnAddNewSymbolResponse();
    }

    /**
     * Create an instance of {@link OnCheckEndGame }
     * 
     */
    public OnCheckEndGame createOnCheckEndGame() {
        return new OnCheckEndGame();
    }

    /**
     * Create an instance of {@link OnCheckEndGameResponse }
     * 
     */
    public OnCheckEndGameResponse createOnCheckEndGameResponse() {
        return new OnCheckEndGameResponse();
    }

    /**
     * Create an instance of {@link OnConnectToGameServer }
     * 
     */
    public OnConnectToGameServer createOnConnectToGameServer() {
        return new OnConnectToGameServer();
    }

    /**
     * Create an instance of {@link OnConnectToGameServerResponse }
     * 
     */
    public OnConnectToGameServerResponse createOnConnectToGameServerResponse() {
        return new OnConnectToGameServerResponse();
    }

    /**
     * Create an instance of {@link OnGetNewBorders }
     * 
     */
    public OnGetNewBorders createOnGetNewBorders() {
        return new OnGetNewBorders();
    }

    /**
     * Create an instance of {@link OnGetNewBordersResponse }
     * 
     */
    public OnGetNewBordersResponse createOnGetNewBordersResponse() {
        return new OnGetNewBordersResponse();
    }

    /**
     * Create an instance of {@link OnGetNewSymbols }
     * 
     */
    public OnGetNewSymbols createOnGetNewSymbols() {
        return new OnGetNewSymbols();
    }

    /**
     * Create an instance of {@link OnGetNewSymbolsResponse }
     * 
     */
    public OnGetNewSymbolsResponse createOnGetNewSymbolsResponse() {
        return new OnGetNewSymbolsResponse();
    }

    /**
     * Create an instance of {@link OnGetPlayerMove }
     * 
     */
    public OnGetPlayerMove createOnGetPlayerMove() {
        return new OnGetPlayerMove();
    }

    /**
     * Create an instance of {@link OnGetPlayerMoveResponse }
     * 
     */
    public OnGetPlayerMoveResponse createOnGetPlayerMoveResponse() {
        return new OnGetPlayerMoveResponse();
    }

    /**
     * Create an instance of {@link OnStartGame }
     * 
     */
    public OnStartGame createOnStartGame() {
        return new OnStartGame();
    }

    /**
     * Create an instance of {@link OnStartGameResponse }
     * 
     */
    public OnStartGameResponse createOnStartGameResponse() {
        return new OnStartGameResponse();
    }

    /**
     * Create an instance of {@link AddNewBorder }
     * 
     */
    public AddNewBorder createAddNewBorder() {
        return new AddNewBorder();
    }

    /**
     * Create an instance of {@link AddNewSymbol }
     * 
     */
    public AddNewSymbol createAddNewSymbol() {
        return new AddNewSymbol();
    }

    /**
     * Create an instance of {@link StopGame }
     * 
     */
    public StopGame createStopGame() {
        return new StopGame();
    }

    /**
     * Create an instance of {@link StartGame }
     * 
     */
    public StartGame createStartGame() {
        return new StartGame();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnAddNewBorder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnAddNewBorder }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onAddNewBorder")
    public JAXBElement<OnAddNewBorder> createOnAddNewBorder(OnAddNewBorder value) {
        return new JAXBElement<OnAddNewBorder>(_OnAddNewBorder_QNAME, OnAddNewBorder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnAddNewBorderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnAddNewBorderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onAddNewBorderResponse")
    public JAXBElement<OnAddNewBorderResponse> createOnAddNewBorderResponse(OnAddNewBorderResponse value) {
        return new JAXBElement<OnAddNewBorderResponse>(_OnAddNewBorderResponse_QNAME, OnAddNewBorderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnAddNewSymbol }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnAddNewSymbol }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onAddNewSymbol")
    public JAXBElement<OnAddNewSymbol> createOnAddNewSymbol(OnAddNewSymbol value) {
        return new JAXBElement<OnAddNewSymbol>(_OnAddNewSymbol_QNAME, OnAddNewSymbol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnAddNewSymbolResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnAddNewSymbolResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onAddNewSymbolResponse")
    public JAXBElement<OnAddNewSymbolResponse> createOnAddNewSymbolResponse(OnAddNewSymbolResponse value) {
        return new JAXBElement<OnAddNewSymbolResponse>(_OnAddNewSymbolResponse_QNAME, OnAddNewSymbolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnCheckEndGame }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnCheckEndGame }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onCheckEndGame")
    public JAXBElement<OnCheckEndGame> createOnCheckEndGame(OnCheckEndGame value) {
        return new JAXBElement<OnCheckEndGame>(_OnCheckEndGame_QNAME, OnCheckEndGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnCheckEndGameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnCheckEndGameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onCheckEndGameResponse")
    public JAXBElement<OnCheckEndGameResponse> createOnCheckEndGameResponse(OnCheckEndGameResponse value) {
        return new JAXBElement<OnCheckEndGameResponse>(_OnCheckEndGameResponse_QNAME, OnCheckEndGameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnConnectToGameServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnConnectToGameServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onConnectToGameServer")
    public JAXBElement<OnConnectToGameServer> createOnConnectToGameServer(OnConnectToGameServer value) {
        return new JAXBElement<OnConnectToGameServer>(_OnConnectToGameServer_QNAME, OnConnectToGameServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnConnectToGameServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnConnectToGameServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onConnectToGameServerResponse")
    public JAXBElement<OnConnectToGameServerResponse> createOnConnectToGameServerResponse(OnConnectToGameServerResponse value) {
        return new JAXBElement<OnConnectToGameServerResponse>(_OnConnectToGameServerResponse_QNAME, OnConnectToGameServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnGetNewBorders }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnGetNewBorders }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onGetNewBorders")
    public JAXBElement<OnGetNewBorders> createOnGetNewBorders(OnGetNewBorders value) {
        return new JAXBElement<OnGetNewBorders>(_OnGetNewBorders_QNAME, OnGetNewBorders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnGetNewBordersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnGetNewBordersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onGetNewBordersResponse")
    public JAXBElement<OnGetNewBordersResponse> createOnGetNewBordersResponse(OnGetNewBordersResponse value) {
        return new JAXBElement<OnGetNewBordersResponse>(_OnGetNewBordersResponse_QNAME, OnGetNewBordersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnGetNewSymbols }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnGetNewSymbols }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onGetNewSymbols")
    public JAXBElement<OnGetNewSymbols> createOnGetNewSymbols(OnGetNewSymbols value) {
        return new JAXBElement<OnGetNewSymbols>(_OnGetNewSymbols_QNAME, OnGetNewSymbols.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnGetNewSymbolsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnGetNewSymbolsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onGetNewSymbolsResponse")
    public JAXBElement<OnGetNewSymbolsResponse> createOnGetNewSymbolsResponse(OnGetNewSymbolsResponse value) {
        return new JAXBElement<OnGetNewSymbolsResponse>(_OnGetNewSymbolsResponse_QNAME, OnGetNewSymbolsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnGetPlayerMove }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnGetPlayerMove }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onGetPlayerMove")
    public JAXBElement<OnGetPlayerMove> createOnGetPlayerMove(OnGetPlayerMove value) {
        return new JAXBElement<OnGetPlayerMove>(_OnGetPlayerMove_QNAME, OnGetPlayerMove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnGetPlayerMoveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnGetPlayerMoveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onGetPlayerMoveResponse")
    public JAXBElement<OnGetPlayerMoveResponse> createOnGetPlayerMoveResponse(OnGetPlayerMoveResponse value) {
        return new JAXBElement<OnGetPlayerMoveResponse>(_OnGetPlayerMoveResponse_QNAME, OnGetPlayerMoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStartGame }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnStartGame }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onStartGame")
    public JAXBElement<OnStartGame> createOnStartGame(OnStartGame value) {
        return new JAXBElement<OnStartGame>(_OnStartGame_QNAME, OnStartGame.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnStartGameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OnStartGameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.corridorsgametwo.davydov.com/", name = "onStartGameResponse")
    public JAXBElement<OnStartGameResponse> createOnStartGameResponse(OnStartGameResponse value) {
        return new JAXBElement<OnStartGameResponse>(_OnStartGameResponse_QNAME, OnStartGameResponse.class, null, value);
    }

}
