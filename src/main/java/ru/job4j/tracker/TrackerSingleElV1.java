package ru.job4j.tracker;

public enum TrackerSingleElV1 {
    INSTANCE;

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleElV1 tracker = TrackerSingleElV1.INSTANCE;
    }

}
