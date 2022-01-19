package com.kodilla.rps.game;

import com.kodilla.rps.enums.MovesEnum;
import com.kodilla.rps.enums.ResultsEnum;
import com.kodilla.rps.player.ComputerPlayer;
import com.kodilla.rps.player.HumanPlayer;
import com.kodilla.rps.player.Player;
import com.kodilla.rps.result.ResultEvaluator;
import com.kodilla.rps.ui.UICreator;

import static com.kodilla.rps.enums.MovesEnum.END_GAME;
import static com.kodilla.rps.enums.MovesEnum.RESTART_GAME;
import static com.kodilla.rps.enums.ResultsEnum.DRAW;
import static com.kodilla.rps.enums.ResultsEnum.HUMAN_WINS;

public class RockPaperScissorsGame {

    private int round = 0;
    private int roundsAmount;
    private Player player;
    private Player computer;


    public RockPaperScissorsGame(GameSettings settings) {
        this.roundsAmount = settings.getRoundsAmount();
        this.player = new HumanPlayer(settings.getPlayerName());
        this.computer = new ComputerPlayer("Komputer");
    }

    public void start() {

        while(round < roundsAmount) {
            MovesEnum playerMove = player.makeMove();
            MovesEnum computerMove = computer.makeMove();

            if(playerMove.equals(RESTART_GAME)) {
                if(UICreator.confirmGameRestart().equalsIgnoreCase("T")) {
                    round = 0;
                }
                continue;
            }

            if(playerMove.equals(END_GAME)) {
                if(UICreator.confirmGameEnd().equalsIgnoreCase("T")) {
                    break;
                } else {
                    continue;
                }
            }

            ResultsEnum result = new ResultEvaluator(playerMove, computerMove).evaluate();
            actualizeScore(result);
            UICreator.showGameState(player, computer, result);

            round++;
        }
    }

    public void showTheWinner() {
        if(player.getScore() > computer.getScore()) {
            System.out.println("Gracz wygrał !!!");
        } else if(player.getScore() < computer.getScore()) {
            System.out.println("Komputer wygrał !!!");
        } else {
            System.out.println("Jest remis !!!");
        }

    }

    private void actualizeScore(ResultsEnum result) {
        if(result.equals(DRAW)) {
            return;
        }

        if(result.equals(HUMAN_WINS)) {
            this.player.incrementScore();
        } else {
            this.computer.incrementScore();
        }
    }

}
