package com.kodilla.rps;

import com.kodilla.rps.game.GameSettings;
import com.kodilla.rps.game.RockPaperScissorsGame;
import com.kodilla.rps.ui.UICreator;

public class RpsRunner {

    public static void main(String[] args) {


        GameSettings gameSettings = UICreator.enterGameSettings();
        UICreator.showGameManuals();
        RockPaperScissorsGame rpsGame = new RockPaperScissorsGame(gameSettings);

        rpsGame.start();
    }
}
