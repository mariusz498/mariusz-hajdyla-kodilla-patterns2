package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final Task createTask(TaskTypes taskType) {
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
