package com.kodilla.rps.player;

import com.kodilla.rps.enums.MovesEnum;
import com.kodilla.rps.ui.UICreator;

public class HumanPlayer implements Player {

    private String name;
    private int score = 0;
    private MovesEnum currentMove;

    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    public MovesEnum makeMove() {
        return this.currentMove = UICreator.enterPlayerMove();
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
