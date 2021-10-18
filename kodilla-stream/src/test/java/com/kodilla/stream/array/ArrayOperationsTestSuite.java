package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {23, 4, 6, 7, 78, 54, 32, 43, 8, 45, 49, 1, 2, 5, 9, 0, 12, 11, 15, 200};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(30.2, average);
    }
}
