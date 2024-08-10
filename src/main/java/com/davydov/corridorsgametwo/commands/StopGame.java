package com.davydov.corridorsgametwo.commands;

public class StopGame {
    public Boolean gameStatus;
    public String winningPlayer;

    public StopGame() {}

    public StopGame(Boolean gameStatus, String winningPlayer) {
        this.gameStatus = gameStatus;
        this.winningPlayer = winningPlayer;
    }
}
