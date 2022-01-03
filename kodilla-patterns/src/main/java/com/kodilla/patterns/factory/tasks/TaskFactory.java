package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING_TASK = "SHOPPING";
    public static final String PAINTING_TASK = "PAINITING";
    public static final String DRIVING_TASK = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Shopping", "milk", 1);
            case PAINTING_TASK:
                return new PaintingTask("Painting", "yellow", "sun");
            case DRIVING_TASK:
                return new DrivingTask("Driving", "to Berlin", "by Train");
            default:
                return null;
        }
    }
}
