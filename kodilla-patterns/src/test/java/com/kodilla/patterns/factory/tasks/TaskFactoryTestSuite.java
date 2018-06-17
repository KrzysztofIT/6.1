package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();
        //Then
        Assert.assertEquals(true , shopping.isTaskExecuted());
        Assert.assertEquals( "Food List",  shopping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();
        //Then
        Assert.assertEquals(true , painting.isTaskExecuted());
        Assert.assertEquals( "Painting List",  painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();
        //Then
        Assert.assertEquals(true , driving.isTaskExecuted());
        Assert.assertEquals( "Drift List",  driving.getTaskName());
    }
}
