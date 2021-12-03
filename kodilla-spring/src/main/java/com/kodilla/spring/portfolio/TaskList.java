package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;
    private String name;

    public TaskList(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);

    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                ", name='" + name + '\'' +
                '}';
    }
}
