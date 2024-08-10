package com.davydov.corridorsgametwo.commands;

public class StartGame {
    public Boolean gameStatus;
    public String playerMove;

    public StartGame() {}

    public StartGame(Boolean gameStatus, String playerMove) {
        this.gameStatus = gameStatus;
        this.playerMove = playerMove;
    }
}
