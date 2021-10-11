package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private static final String NAME = "circle";

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String getShapeName() {
        return NAME;
    }
    @Override
    public double getField() {
        return  Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}



