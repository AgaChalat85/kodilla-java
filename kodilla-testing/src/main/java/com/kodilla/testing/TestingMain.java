package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingMain {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();

        System.out.println(oddExterminator.exterminate(myList));
    }
}

