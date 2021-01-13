package ru.job4j.tracker.collection.search;

public class Tasks {
    private String description;
    private String number;

    public Tasks(String number, String description) {
        this.number = number;
        this.description = description;

    }

    public String getNumber() {
        return number;
    }
}
