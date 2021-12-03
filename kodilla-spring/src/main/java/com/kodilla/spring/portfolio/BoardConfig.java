package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(toDoList(), inProgressList(), doneList());
    }

    @Bean
    TaskList toDoList() {

        return new TaskList("ToDo list");
    }

    @Bean
    TaskList inProgressList() {
        return new TaskList("In Progress List");
    }

    @Bean
    TaskList doneList() {
        return new TaskList("Done List");
    }
}
