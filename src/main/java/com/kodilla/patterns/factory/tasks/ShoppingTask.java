package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean taskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return taskExecuted;
    }

    public void executeTask() {
        System.out.println("Task " + getTaskName() + " to buy " + whatToBuy + "(" + quantity + ") is done!");
        taskExecuted = true;
    }
}
