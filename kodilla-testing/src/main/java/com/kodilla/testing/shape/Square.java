package com.kodilla.testing.shape;

public class Square implements Shape {

    private double side;
    private static final String NAME = "square";

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return NAME;
    }

    @Override
    public double getField() {
        return side * side;
    }

    public double getSide() {
        return side;
    }
}
