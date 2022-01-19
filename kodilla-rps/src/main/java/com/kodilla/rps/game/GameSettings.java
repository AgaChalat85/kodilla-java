package com.kodilla.rps.game;

public class GameSettings {

    private String playerName;
    private int roundsAmount;

    public GameSettings(String playerName, int roundsAmount) {
        this.playerName = playerName;
        this.roundsAmount = roundsAmount;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getRoundsAmount() {
        return roundsAmount;
    }

    @Override
    public String toString() {
        return this.playerName + " " + this.roundsAmount;
    }
}
