package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    public Mentor(String name) {
        this.name = name;
    }

    private final String name;
    private int updateCount;


    @Override
    public void update(StudentTasks tasks) {
        System.out.println(name + ": New task in queue done by " + tasks.getStudentName() + "\n" +
                " (total: " + tasks.getTasks().size() + " tasks");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
