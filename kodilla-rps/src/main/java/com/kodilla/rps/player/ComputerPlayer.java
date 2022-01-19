package com.kodilla.rps.player;

import com.kodilla.rps.enums.MovesEnum;

public class ComputerPlayer implements Player {

    private String name;
    private int score = 0;
    private MovesEnum currentMove;

    public ComputerPlayer(String name) {
        this.name = name;
    }

    @Override
    public MovesEnum makeMove() {
        return this.currentMove = MovesEnum.drawARandomMove();
    }

    @Override
    public void incrementScore() {
        this.score++;
    }

    @Override
    public MovesEnum getCurrentMove() {
        return this.currentMove;
    }

    @Override
    public int getScore() {
        return this.score;
    }
}
