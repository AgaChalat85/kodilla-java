package com.kodilla.testing.shape;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void TestAddShape() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        //When
        collector.addFigure(new Square(5.0));
        collector.addFigure(new Circle(6.0));
        collector.addFigure(new Triangle(6.0, 8.0));
        //Then
        assertEquals(3,collector.getShapes().size());
    }
    @Test
    void TestRemoveShape() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(7.0);
        collector.addFigure(square);
        //When
        boolean result = collector.removeFigure(square);
        //Then
        assertTrue(result);
        assertEquals(0,collector.getShapes().size());
    }
    @Test
    void testRemoveShapeNotExisting() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape square = new Square(7.0);
        //When
        boolean result = collector.removeFigure(square) ;
        //Then
        assertFalse(result);
    }

    @Test
    void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape circle = new Circle(6.0);
        collector.getShapes().add(circle);
        //When
        Shape retrievedShape = collector.getFigure(0);
        //Then
        assertEquals(circle, retrievedShape);
    }
    @Test
    void testShowFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        collector.addFigure(new Square(4.0));
        collector.addFigure(new Circle(8.0));
        collector.addFigure(new Triangle(6.0, 8.0));
        //When
        String expectedResult = "square, circle, triangle";
        String result = collector.showFigures();
        //Then
        assertEquals(expectedResult, result);
    }
}
