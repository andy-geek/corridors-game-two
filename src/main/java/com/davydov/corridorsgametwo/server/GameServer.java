package com.davydov.corridorsgametwo.server;

import com.davydov.corridorsgametwo.commands.AddNewBorder;
import com.davydov.corridorsgametwo.commands.AddNewSymbol;
import com.davydov.corridorsgametwo.commands.StartGame;
import com.davydov.corridorsgametwo.commands.StopGame;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.HashMap;

@WebService
public class GameServer {
    public static final Integer gameServerPort = 8080;
    public static final String gameServerURL = "http://0.0.0.0:%d/GameServer";

    static final Integer FIELD_SIZE = 10;
    static final Integer NUM_SIDES = 4;

    String playerMove = "X";

    Integer players = 0;

    String[][][] gameField = new String[FIELD_SIZE][FIELD_SIZE][NUM_SIDES + 1];

    HashMap<String, Integer> typesBorders = new HashMap<>();
    HashMap<String, ArrayList<AddNewBorder>> newBorders = new HashMap<>();
    HashMap<String, ArrayList<AddNewSymbol>> newSymbols = new HashMap<>();

    @WebMethod
    public String onConnectToGameServer() {
        players++;
        return (players <= 2) ? ((players == 1) ? "X" : "O") : null;
    }

    @WebMethod
    public StartGame onStartGame() {
        return (players == 2) ? new StartGame(true, playerMove) : null;
    }

    @WebMethod
    public ArrayList<AddNewBorder> onGetNewBorders(String playerSymbol) {
        return (newBorders.containsKey(playerSymbol)) ? newBorders.remove(playerSymbol) : null;
    }

    @WebMethod
    public ArrayList<AddNewSymbol> onGetNewSymbols(String playerSymbol) {
        return (newSymbols.containsKey(playerSymbol)) ? newSymbols.remove(playerSymbol) : null;
    }

    @WebMethod
    public String onGetPlayerMove() {
        return playerMove;
    }

    @WebMethod
    public StopGame onCheckEndGame() {
        int numX = 0;
        int numO = 0;

        boolean result = true;
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (gameField[i][j][NUM_SIDES] != null) {
                    if (gameField[i][j][NUM_SIDES].equals("X")) {
                        numX++;
                    } else if (gameField[i][j][NUM_SIDES].equals("O")) {
                        numO++;
                    }
                } else {
                    result = false;
                    break;
                }
            }
        }

        if (result) {
            if (numX > numO) {
                return new StopGame(false, "X");
            } else if (numX < numO) {
                return new StopGame(false, "O");
            } else {
                return new StopGame(false, "D");
            }
        }

        return null;
    }

    @WebMethod
    public void onAddNewBorder(AddNewBorder newBorder) {
        Integer borderTypeIndex = typesBorders.get(newBorder.borderType);
        if (gameField[newBorder.rowIndex][newBorder.columnIndex][borderTypeIndex] == null) {
            newBorders.put("X", new ArrayList<>());
            newBorders.put("O", new ArrayList<>());

            gameField[newBorder.rowIndex][newBorder.columnIndex][borderTypeIndex] = newBorder.borderType;
            playerMove = (newBorder.playerMove.equals("X")) ? "O" : "X";

            newBorders.get("X").add(newBorder);
            newBorders.get("O").add(newBorder);

            AddNewBorder additionalBorder = null;

            if (newBorder.borderType.equals("LEFT") && newBorder.columnIndex > 0) {
                gameField[newBorder.rowIndex][newBorder.columnIndex - 1][typesBorders.get("RIGHT")] = "RIGHT";
                additionalBorder = new AddNewBorder("RIGHT", newBorder.columnIndex - 1, newBorder.rowIndex,
                        newBorder.playerMove);
            } else if (newBorder.borderType.equals("BOTTOM") && newBorder.rowIndex < FIELD_SIZE - 1) {
                gameField[newBorder.rowIndex + 1][newBorder.columnIndex][typesBorders.get("TOP")] = "TOP";
                additionalBorder = new AddNewBorder("TOP", newBorder.columnIndex, newBorder.rowIndex + 1,
                        newBorder.playerMove);
            } else if (newBorder.borderType.equals("TOP") && newBorder.rowIndex > 0) {
                gameField[newBorder.rowIndex - 1][newBorder.columnIndex][typesBorders.get("BOTTOM")] = "BOTTOM";
                additionalBorder = new AddNewBorder("BOTTOM", newBorder.columnIndex, newBorder.rowIndex - 1,
                        newBorder.playerMove);
            } else if (newBorder.borderType.equals("RIGHT") && newBorder.columnIndex < FIELD_SIZE - 1) {
                gameField[newBorder.rowIndex][newBorder.columnIndex + 1][typesBorders.get("LEFT")] = "LEFT";
                additionalBorder = new AddNewBorder("LEFT", newBorder.columnIndex + 1, newBorder.rowIndex,
                        newBorder.playerMove);
            }

            if (additionalBorder != null) {
                newBorders.get("X").add(additionalBorder);
                newBorders.get("O").add(additionalBorder);

                onAddNewSymbol(new AddNewSymbol(additionalBorder.playerMove, additionalBorder.columnIndex, additionalBorder.rowIndex));
            }

            onAddNewSymbol(new AddNewSymbol(newBorder.playerMove, newBorder.columnIndex, newBorder.rowIndex));
        }
    }

    @WebMethod
    public void onAddNewSymbol(AddNewSymbol newSymbol) {
        boolean result = true;
        for (int i = 0; i < NUM_SIDES; i++) {
            if (gameField[newSymbol.rowIndex][newSymbol.columnIndex][i] == null) {
                result = false;
                break;
            }
        }

        if (result) {
            gameField[newSymbol.rowIndex][newSymbol.columnIndex][NUM_SIDES] = newSymbol.playerSymbol;
            playerMove = newSymbol.playerSymbol;

            if (!newSymbols.containsKey("X")) {
                newSymbols.put("X", new ArrayList<>());
            }
            if (!newSymbols.containsKey("O")) {
                newSymbols.put("O", new ArrayList<>());
            }

            newSymbols.get("X").add(newSymbol);
            newSymbols.get("O").add(newSymbol);
        }
    }


    public static void main(String[] args) {
        GameServer gameServer = new GameServer();

        gameServer.typesBorders.put("LEFT", 0);
        gameServer.typesBorders.put("BOTTOM", 1);
        gameServer.typesBorders.put("TOP", 2);
        gameServer.typesBorders.put("RIGHT", 3);

        Endpoint.publish(String.format(gameServerURL, gameServerPort), gameServer);
    }
}
