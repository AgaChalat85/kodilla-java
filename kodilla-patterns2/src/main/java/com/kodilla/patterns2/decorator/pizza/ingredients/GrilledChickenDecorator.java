package com.kodilla.patterns2.decorator.pizza.ingredients;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class GrilledChickenDecorator extends AbstractPizzaOrderDecorator {

    public GrilledChickenDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + grilled chicken";
    }
}
