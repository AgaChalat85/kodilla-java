package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        // Testing SimpleUser class
        SimpleUser user = new SimpleUser("theForumUser");

        String result = user.getUserName();
        if(result.equals("theForumUser")){
            System.out.println(" test OK");
        } else {
            System.out.println("Error!");
        }
        // Testing Calculator class
        Calculator calculator = new Calculator();
        // Testing add method
        int additionResult = calculator.add(45,120);
        if(additionResult == 165) {
            System.out.println("Calculator - Addition: test OK");
        } else {
            System.out.println("Calculator - Addition: Error!");
        }
        // Testing subtract method
        int subtractionResult = calculator.subtract(100, 55);
        if (subtractionResult == 45) {
            System.out.println("Calculator - Substraction: test OK");
        } else {
            System.out.println("Calculator - Substraction: Error!");
        }
    }
}
