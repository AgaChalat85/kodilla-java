package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksQueueTestSuite {

    @Test
    public void testUpdate() {
        // Given
        StudentTasks tasksQueue1 = new StudentTasks("Marcin Kowalski");
        StudentTasks tasksQueue2 = new StudentTasks("Michal Krzykawski");
        StudentTasks tasksQueue3 = new StudentTasks("Weronika Maslowska");
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        tasksQueue1.registerObserver(mentor1);
        tasksQueue2.registerObserver(mentor2);
        tasksQueue3.registerObserver(mentor1);

        //When
        tasksQueue1.addTask("Task 24.3");
        tasksQueue1.addTask("Task 24.4");
        tasksQueue1.addTask("Task 24.5");
        tasksQueue1.addTask("Task 24.6");

        tasksQueue2.addTask("Task 23.5");
        tasksQueue2.addTask("Task 24.1");
        tasksQueue2.addTask("Task 24.2");

        tasksQueue3.addTask("Task 24.6");

        // Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());

    }
}
