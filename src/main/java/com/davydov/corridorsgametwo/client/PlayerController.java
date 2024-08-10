package com.davydov.corridorsgametwo.client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.HPos;
import javafx.geometry.VPos;

public class PlayerController {
    static final Double BORDER_SIZE = 2.0;
    static final Double STROKE_WIDTH = 2.5;
    static final Integer TEXT_FONT = 33;

    static final String STYLE = "-fx-background-color: lightgrey";

    Player player;

    @FXML
    Label labelPlayerMove;
    @FXML
    Label labelPlayerSymbol;
    @FXML
    GridPane gamePanel;
    @FXML
    Button btnConnect;
    @FXML
    Button btnLeft;
    @FXML
    Button btnBottom;
    @FXML
    Button btnTop;
    @FXML
    Button btnRight;

    Double cellHeight;
    Double cellWidth;

    Integer columnIndex;
    Integer rowIndex;

    Label fill;

    @FXML
    protected void onConnect() {
        player.connectToGameServer();
        btnConnect.setDisable(true);

        cellHeight = gamePanel.getHeight() / gamePanel.getRowCount();
        cellWidth = gamePanel.getWidth() / gamePanel.getColumnCount();

        gamePanel.setOnMouseClicked(mouseEvent -> this.onCellClicked(
                (int) Math.floor(mouseEvent.getX() / cellWidth),
                (int) Math.floor(mouseEvent.getY() / cellHeight)
        ));

        onCreateFill();
    }

    @FXML
    protected void onAddLeftBorder() {
        if (columnIndex != null && rowIndex != null) {
            player.sendCommandAddNewBorder("LEFT", columnIndex, rowIndex);
            onResetValues();
        }
    }

    @FXML
    protected void onAddBottomBorder() {
        if (columnIndex != null && rowIndex != null) {
            player.sendCommandAddNewBorder("BOTTOM", columnIndex, rowIndex);
            onResetValues();
        }
    }

    @FXML
    protected void onAddTopBorder() {
        if (columnIndex != null && rowIndex != null) {
            player.sendCommandAddNewBorder("TOP", columnIndex, rowIndex);
            onResetValues();
        }
    }

    @FXML
    protected void onAddRightBorder() {
        if (columnIndex != null && rowIndex != null) {
            player.sendCommandAddNewBorder("RIGHT", columnIndex, rowIndex);
            onResetValues();
        }
    }

    protected void onCreateFill() {
        fill = new Label();
        fill.setPrefWidth(cellWidth - BORDER_SIZE);
        fill.setPrefHeight(cellHeight - BORDER_SIZE);
        fill.setStyle(STYLE);

        GridPane.setHalignment(fill, HPos.CENTER);
        GridPane.setValignment(fill, VPos.CENTER);
    }

    protected void onResetValues() {
        columnIndex = null;
        rowIndex = null;

        gamePanel.getChildren().remove(fill);

        btnLeft.setDisable(true);
        btnBottom.setDisable(true);
        btnTop.setDisable(true);
        btnRight.setDisable(true);
    }

    protected void onCellClicked(int columnId, int rowId) {
        columnIndex = columnId;
        rowIndex = rowId;

        gamePanel.getChildren().remove(fill);
        gamePanel.add(fill, columnIndex, rowIndex);

        btnLeft.setDisable(false);
        btnBottom.setDisable(false);
        btnTop.setDisable(false);
        btnRight.setDisable(false);
    }
}
