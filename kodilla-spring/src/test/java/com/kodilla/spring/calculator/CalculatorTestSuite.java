package com.kodilla.spring.calculator;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        double addResult = calculator.add(60, 45);
        double subResult = calculator.sub(50, 35);
        double mulResult = calculator.mul(9, 4);
        double divResult = calculator.div(60, 4);

        //Then
        assertEquals(105, addResult);
        assertEquals(15, subResult);
        assertEquals(36, mulResult);
        assertEquals(15, divResult);
        assertThrows(ArithmeticException.class, () -> calculator.div(60, 0));

    }
}
