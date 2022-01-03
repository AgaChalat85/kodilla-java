package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        boolean isTaskExecutedBeforeCallingMethodExecuteTask = shopping.isTaskExecuted();
        shopping.executeTask();
        boolean isTaskExecutedAfterCallingMethodExecuteTask = shopping.isTaskExecuted();
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertFalse(isTaskExecutedBeforeCallingMethodExecuteTask);
        assertTrue(isTaskExecutedAfterCallingMethodExecuteTask);

    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        boolean isTaskExecutedBeforeCallingMethodExecuteTask = painting.isTaskExecuted();
        painting.executeTask();
        boolean isTaskExecutedAfterCallingMethodExecuteTask = painting.isTaskExecuted();
        //Then
        assertEquals("Painting", painting.getTaskName());
        assertFalse(isTaskExecutedBeforeCallingMethodExecuteTask);
        assertTrue(isTaskExecutedAfterCallingMethodExecuteTask);
    }

    @Test
    void testFactoryRectangle() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        boolean isTaskExecutedBeforeCallingMethodExecuteTask = driving.isTaskExecuted();
        driving.executeTask();
        boolean isTaskExecutedAfterCallingMethodExecuteTask = driving.isTaskExecuted();
        //Then
        assertEquals("Driving", driving.getTaskName());
        assertFalse(isTaskExecutedBeforeCallingMethodExecuteTask);
        assertTrue(isTaskExecutedAfterCallingMethodExecuteTask);
    }

}