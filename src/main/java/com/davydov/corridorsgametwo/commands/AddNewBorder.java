package com.davydov.corridorsgametwo.commands;

public class AddNewBorder {
    public String borderType;
    public Integer columnIndex;
    public Integer rowIndex;

    public String playerMove;

    public AddNewBorder() {}

    public AddNewBorder(String borderType, Integer columnIndex, Integer rowIndex, String playerMove) {
        this.borderType = borderType;
        this.columnIndex = columnIndex;
        this.rowIndex = rowIndex;
        this.playerMove = playerMove;
    }
}
