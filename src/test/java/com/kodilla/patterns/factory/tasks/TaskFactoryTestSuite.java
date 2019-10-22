package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.createTask(TaskTypes.SHOPPING_TASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("Holiday shopping", shoppingTask.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory =new TaskFactory();
        //When
        Task paintingTask = factory.createTask(TaskTypes.PAINTING_TASK);
        paintingTask.executeTask();
        //Then
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("Renovating home", paintingTask.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory =new TaskFactory();
        //When
        Task drivingTask = factory.createTask(TaskTypes.DRIVING_TASK);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("Taxi driver", drivingTask.getTaskName());
    }
}