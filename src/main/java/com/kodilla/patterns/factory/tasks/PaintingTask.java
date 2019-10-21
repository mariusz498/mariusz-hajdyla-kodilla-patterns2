package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private boolean taskExecuted;
    private final String color;
    private final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return taskExecuted;
    }

    public void executeTask() {
        System.out.println("Task " + getTaskName() + " to paint " + whatToPaint + " on color " + color + " is done!");
        taskExecuted = true;
    }
}
