package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //Given
        //When
        board.getToDoList().addTask("HQLs for analysis");
        board.getInProgressList().addTask("Optimize searching");
        board.getDoneList().addTask("Use Streams");
        //Then
        assertEquals("HQLs for analysis", board.getToDoList().getTasks().get(0));
        assertEquals("Optimize searching", board.getInProgressList().getTasks().get(0));
        assertEquals("Use Streams", board.getDoneList().getTasks().get(0));

    }
}



