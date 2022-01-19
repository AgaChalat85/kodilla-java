package com.kodilla.rps.enums;

import java.util.Arrays;
import java.util.Random;

public enum MovesEnum {
    ROCK("1"),
    PAPER("2"),
    SCISSORS("3"),
    END_GAME("x"),
    RESTART_GAME("n");

    private String moveKey;

    MovesEnum(String moveKey) {
        this.moveKey = moveKey;
    }

    public static MovesEnum drawARandomMove() {

        return values()[new Random().nextInt(3)];
    }

    public static MovesEnum getByKey(String key) {
        return Arrays.asList(values()).stream().filter(move -> move.moveKey.equals(key)).findAny().orElse(null);
    }

}
