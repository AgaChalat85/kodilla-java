package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.ingredients.ExtraMozzarellaDecorator;
import com.kodilla.patterns2.decorator.pizza.ingredients.GrilledChickenDecorator;
import com.kodilla.patterns2.decorator.pizza.sauce.XXLGarlicSauceDecorator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Basic pizza with cheese and tomato sauce ", description);
    }

    @Test
    public void testPizzaWithSauceAndExtraIngredientsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GrilledChickenDecorator(theOrder);
        theOrder = new ExtraMozzarellaDecorator(theOrder);
        theOrder = new XXLGarlicSauceDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(28), theCost);
    }

    @Test
    public void testPizzaWithSauceAndExtraIngredientsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new GrilledChickenDecorator(theOrder);
        theOrder = new ExtraMozzarellaDecorator(theOrder);
        theOrder = new XXLGarlicSauceDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza with cheese and tomato sauce  + grilled chicken + extra mozzarella + XXL garlic sauce", description);
    }
}