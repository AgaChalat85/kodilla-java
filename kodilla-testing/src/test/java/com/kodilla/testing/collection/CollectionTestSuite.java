package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when the List of numbers is empty " +
            "then exterminate() method should return empty list of even numbers"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        //When
        List<Integer> evenNumbers = oddExterminator.exterminate(emptyList);
        //Then
        Assertions.assertTrue(evenNumbers.isEmpty());
    }
    @DisplayName("when the list include even and odd numbers " +
            "then exterminate() method should return only even numbers"
    )
    @Test
    void testOddNumbersExterminatorNormalList() {
      //Given
        List<Integer> normalList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
        OddNumbersExterminator oddExterminator = new OddNumbersExterminator();
        List<Integer> expectedList = Arrays.asList(2,4,6,8,10,12);
        //When
        List<Integer>  evenNumbers = oddExterminator.exterminate(normalList);
        //Then
        Assertions.assertEquals(expectedList, evenNumbers);
    }
}
