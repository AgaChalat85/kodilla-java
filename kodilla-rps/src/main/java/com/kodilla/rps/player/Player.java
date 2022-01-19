package com.kodilla.rps.player;

import com.kodilla.rps.enums.MovesEnum;

public interface Player {

    MovesEnum makeMove();

    void incrementScore();

    MovesEnum getCurrentMove();

    int getScore();
}
