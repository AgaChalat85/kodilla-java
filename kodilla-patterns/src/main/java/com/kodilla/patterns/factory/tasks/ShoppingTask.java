package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean taskStatus;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        this.taskStatus = true;

    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskStatus;

    }
}
