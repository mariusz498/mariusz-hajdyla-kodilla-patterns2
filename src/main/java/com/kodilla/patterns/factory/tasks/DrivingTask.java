package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private boolean taskExecuted;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return taskExecuted;
    }

    public void executeTask() {
        System.out.println("Task " + getTaskName() + " to drive to " + where + " with " + using + " is done!");
        taskExecuted = true;
    }
}
