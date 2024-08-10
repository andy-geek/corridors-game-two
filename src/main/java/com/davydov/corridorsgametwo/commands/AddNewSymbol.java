package com.davydov.corridorsgametwo.commands;

public class AddNewSymbol {
    public String playerSymbol;
    public Integer columnIndex;
    public Integer rowIndex;

    public AddNewSymbol() {}

    public AddNewSymbol(String playerSymbol, Integer columnIndex, Integer rowIndex) {
        this.playerSymbol = playerSymbol;
        this.columnIndex = columnIndex;
        this.rowIndex = rowIndex;
    }
}
