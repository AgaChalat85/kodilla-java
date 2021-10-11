package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double base;
    private double height;
    private static final String NAME = "triangle";

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public String getShapeName() {
        return NAME;
    }
    @Override
    public double getField() {
        return (base * height) /2;
    }
}
