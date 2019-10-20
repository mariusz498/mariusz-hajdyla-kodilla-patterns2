package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task createTask(final String taskType) {
        switch (taskType) {
            case DRIVING_TASK:
               DrivingTask drivingTask = new DrivingTask("Taxi driver", "Krakow", "a car");
               return drivingTask;
            case PAINTING_TASK:
                PaintingTask paintingTask = new PaintingTask("Renovating home", "blue", "a house");
                return paintingTask;
            case SHOPPING_TASK:
                ShoppingTask shoppingTask = new ShoppingTask("Holiday shopping", "slippers", 2);
                return shoppingTask;
            default:
                return null;
        }
    }
}
