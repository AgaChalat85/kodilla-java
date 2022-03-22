package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTasks implements Observable {

    private final String studentName;
    private final List<Observer> observers;
    private final Deque<String> tasks;

    public StudentTasks(String studentName) {
        this.studentName = studentName;
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getStudentName() {
        return studentName;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public Deque<String> getTasks() {
        return tasks;
    }
}
