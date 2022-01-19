package com.kodilla.rps.result;

import com.kodilla.rps.enums.MovesEnum;
import com.kodilla.rps.enums.ResultsEnum;

import static com.kodilla.rps.enums.MovesEnum.*;
import static com.kodilla.rps.enums.ResultsEnum.*;

public class ResultEvaluator {

    private MovesEnum playerMove;
    private MovesEnum computerMove;

    public ResultEvaluator(MovesEnum playerMove, MovesEnum computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;
    }


    public ResultsEnum evaluate() {
        if(checkIfHumanWins()) {
            return HUMAN_WINS;
        } else if(playerMove.equals(computerMove)) {
            return DRAW;
        } else {
            return COMPUTER_WINS;
        }
    }

    private boolean checkIfHumanWins() {

        return rockBeatsScissors() || scissorsBeatsPaper() || paperBeatsRock();
    }

    private boolean rockBeatsScissors() {

        return playerMove.equals(ROCK) && computerMove.equals(SCISSORS);
    }

    private boolean scissorsBeatsPaper() {

        return playerMove.equals(SCISSORS) && computerMove.equals(PAPER);
    }

    private boolean paperBeatsRock() {

        return playerMove.equals(PAPER) && computerMove.equals(ROCK);
    }

}
