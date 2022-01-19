package com.kodilla.rps.ui;

import com.kodilla.rps.enums.MovesEnum;
import com.kodilla.rps.enums.ResultsEnum;
import com.kodilla.rps.game.GameSettings;
import com.kodilla.rps.player.Player;

import java.util.Scanner;

public class UICreator {

    public static GameSettings enterGameSettings() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w grze papier, kamień, nożyce");
        System.out.println("Proszę podać imię gracza: ");
        String playerName = scanner.nextLine();
        System.out.println("Proszę podać liczbę rund: ");
        int roundsAmount = scanner.nextInt();

        return new GameSettings(playerName, roundsAmount);
    }

    public static void showGameManuals() {
        System.out.println("------------------------------------------");
        System.out.println("Rozgrywka obsługuje następujące klawisze: ");
        System.out.println("Klawisz 1 - kamień");
        System.out.println("Klawisz 2 - papier");
        System.out.println("Klawisz 3 - nożyce");
        System.out.println("Klawisz x - zakończenie gry poprzedzone pytaniem \"Czy na pewno zakończyć grę?\"");
        System.out.println("Klawisz n - uruchomienie gry od nowa poprzedzone pytaniem \"Czy na pewno zakończyć aktualną grę?\"");
        System.out.println("------------------------------------------");
    }

    public static MovesEnum enterPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        MovesEnum playerMove;
        while (true) {
            System.out.println("Proszę wykonać ruch: ");
            String moveKey = scanner.nextLine();
            playerMove = MovesEnum.getByKey(moveKey);
            if (playerMove != null) {
                return playerMove;
            }
            System.out.println("Niepoprawny ruch!");
        }
    }

    public static void showGameState(Player human, Player computer, ResultsEnum result) {
        System.out.println("------------------------------------------");
        System.out.println("Ruch gracza: " + human.getCurrentMove());
        System.out.println("Ruch komputera: " + computer.getCurrentMove());
        System.out.println("Wynik: " + result);
        System.out.println("Wygrane rundy gracza: " + human.getScore());
        System.out.println("Wygrane rundy komputera: " + computer.getScore());
        System.out.println("------------------------------------------");

    }

    public static String confirmGameEnd() {
        Scanner scanner = new Scanner(System.in);
        String endGame;

        while(true) {
            System.out.println("Czy na pewno zakończyć grę? (T/N) ");
            endGame = scanner.nextLine();

            if(endGame.equals("T") || endGame.equals("N")) {
                return endGame;
            }

            System.out.println("Poproszę potwierdzić znakiem T albo anulować znakiem N");
        }
    }

    public static String confirmGameRestart() {
        Scanner scanner = new Scanner(System.in);
        String restartGame;

        while(true) {
            System.out.println("Czy na pewno zakończyć aktualną grę? (T/N) ");
            restartGame = scanner.nextLine();

            if(restartGame.equals("T") || restartGame.equals("N")) {
                return restartGame;
            }

            System.out.println("Poproszę potwierdzić znakiem T albo anulować znakiem N");
        }
    }
}