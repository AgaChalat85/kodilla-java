package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.Locale;
import java.util.StringJoiner;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5, (a,b)-> a + b);
        expressionExecutor.executeExpression(10,5, (a,b)-> a - b);
        expressionExecutor.executeExpression(10,5, (a,b)-> a * b);
        expressionExecutor.executeExpression(10,5, (a,b)-> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Poem Beautifier");


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Wednesday", t-> t.toUpperCase());
        poemBeautifier.beautify("Leaves are falling Autumn is calling.", t-> t.replace(" ", "***"));
        poemBeautifier.beautify("Wednesday", t-> "ABC " + t + " ABC");
        poemBeautifier.beautify( "autumn Days are here again", t-> t.replaceAll("a", "A"));

    }
}
