package com.davydov.corridorsgametwo.client;

import com.davydov.corridorsgametwo.webservice.*;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Player extends Application {
    public static final Integer gameServerPort = 8080;
    public static final String gameServerURL = "http://0.0.0.0:%d/GameServer?wsdl";

    GameServer gameServer;
    PlayerController playerController;

    Boolean gameStatus = false;
    String playerSymbol;
    String playerMove;
    String winningPlayer;
    String drawSymbol = "D";

    public void connectToGameServer() {
        new Thread(() -> {
            try {
                gameServer = new GameServerService(new URL(String.format(gameServerURL, gameServerPort))).getGameServerPort();
                playerSymbol = gameServer.onConnectToGameServer();
                if (playerSymbol != null) {
                    while (true) {
                        StartGame startGame = gameServer.onStartGame();
                        if (startGame != null) {
                            gameStatus = startGame.isGameStatus();
                            playerMove = startGame.getPlayerMove();
                            break;
                        }
                    }

                    Platform.runLater(this::updateLabels);
                    while (gameStatus) {
                        StopGame stopGame = gameServer.onCheckEndGame();
                        if (stopGame != null) {
                            gameStatus = stopGame.isGameStatus();
                            winningPlayer = stopGame.getWinningPlayer();
                        }

                        ArrayList<AddNewBorder> newBorders = (ArrayList<AddNewBorder>) gameServer.onGetNewBorders(playerSymbol);
                        if (newBorders != null) {
                            for (AddNewBorder border : newBorders) {
                                switch (border.getBorderType()) {
                                    case "LEFT" -> Platform.runLater(() -> {
                                        addNewBorder(HPos.LEFT, VPos.CENTER, border.getColumnIndex(), border.getRowIndex());
                                    });
                                    case "BOTTOM" -> Platform.runLater(() -> {
                                        addNewBorder(HPos.CENTER, VPos.BOTTOM, border.getColumnIndex(), border.getRowIndex());
                                    });
                                    case "TOP" -> Platform.runLater(() -> {
                                        addNewBorder(HPos.CENTER, VPos.TOP, border.getColumnIndex(), border.getRowIndex());
                                    });
                                    case "RIGHT" -> Platform.runLater(() -> {
                                        addNewBorder(HPos.RIGHT, VPos.CENTER, border.getColumnIndex(), border.getRowIndex());
                                    });
                                }
                            }
                        }

                        ArrayList<AddNewSymbol> newSymbols = (ArrayList<AddNewSymbol>) gameServer.onGetNewSymbols(playerSymbol);
                        if (newSymbols != null) {
                            for (AddNewSymbol symbol : newSymbols) {
                                Platform.runLater(() -> {
                                    addNewSymbol(symbol.getPlayerSymbol(), symbol.getColumnIndex(), symbol.getRowIndex());
                                });
                            }
                        }

                        playerMove = gameServer.onGetPlayerMove();
                        Platform.runLater(this::updateLabels);
                    }
                }
            } catch (MalformedURLException ignored) {
            }
        }).start();
    }

    public void addNewBorder(HPos hPos, VPos vPos, int columnIndex, int rowIndex) {
        Line border = new Line();
        border.setStrokeWidth(PlayerController.STROKE_WIDTH);
        border.setStartX(0);
        border.setStartY(0);

        if (vPos == VPos.TOP || vPos == VPos.BOTTOM) {
            border.setEndX(playerController.cellWidth - PlayerController.BORDER_SIZE);
            border.setEndY(0);
        } else {
            border.setEndX(0);
            border.setEndY(playerController.cellHeight - PlayerController.BORDER_SIZE);
        }

        GridPane.setHalignment(border, hPos);
        GridPane.setValignment(border, vPos);
        playerController.gamePanel.add(border, columnIndex, rowIndex);
    }

    public void addNewSymbol(String playerSymbol, int columnIndex, int rowIndex) {
        Label symbol = new Label(playerSymbol);
        symbol.setFont(Font.font(PlayerController.TEXT_FONT));

        GridPane.setHalignment(symbol, HPos.CENTER);
        playerController.gamePanel.add(symbol, columnIndex, rowIndex);
    }

    public void sendCommandAddNewBorder(String borderType, Integer columnIndex, Integer rowIndex) {
        if (gameStatus && playerSymbol.equals(playerMove)) {
            AddNewBorder newBorder = new AddNewBorder();
            newBorder.setBorderType(borderType);
            newBorder.setColumnIndex(columnIndex);
            newBorder.setRowIndex(rowIndex);
            newBorder.setPlayerMove(playerSymbol);

            gameServer.onAddNewBorder(newBorder);
        }
    }

    public void updateLabels() {
        if (playerController.labelPlayerSymbol.getText().isEmpty()) {
            playerController.labelPlayerSymbol.setText("You play: " + playerSymbol);
        }

        if (gameStatus) {
            if (playerMove.equals(playerSymbol)) {
                playerController.labelPlayerMove.setText("Your move!");
            } else  {
                playerController.labelPlayerMove.setText("The opponent's move!");
            }
        } else {
            if (winningPlayer.equals(playerSymbol)) {
                playerController.labelPlayerMove.setText("You have won!");
            } else if (winningPlayer.equals(drawSymbol)){
                playerController.labelPlayerMove.setText("A draw!");
            } else {
                playerController.labelPlayerMove.setText("You have lost!");
            }
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Player.class.getResource("GameWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 430, 515);
        stage.setTitle("Corridors Game Two");
        stage.setScene(scene);
        stage.show();

        playerController = fxmlLoader.getController();
        playerController.player = this;
    }

    public static void main(String[] args) {
        launch();
    }
}
