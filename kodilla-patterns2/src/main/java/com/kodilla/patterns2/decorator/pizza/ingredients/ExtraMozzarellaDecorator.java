package com.kodilla.patterns2.decorator.pizza.ingredients;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class ExtraMozzarellaDecorator extends AbstractPizzaOrderDecorator {

    public ExtraMozzarellaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4.0));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + extra mozzarella";
    }
}

