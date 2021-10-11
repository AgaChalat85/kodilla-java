package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape theShape = null;
        if(n >= 0 && n < shapes.size()) {
            theShape = shapes.get(n);
        }
        return theShape;
    }
    public String showFigures() {
        StringJoiner string = new StringJoiner(", ");
        for (int i = 0; i < shapes.size(); i++) {
            string.add(shapes.get(i).getShapeName());
        }
        return string.toString();
    }

    public List<Shape> getShapes() {
        return shapes;
    }
}


