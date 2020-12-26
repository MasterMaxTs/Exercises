package ru.job4j.tracker;

public class TrackerSingleLlV1 {
    public static TrackerSingleLlV1 instance;

    private TrackerSingleLlV1() {

    }

    public static TrackerSingleLlV1 getInstance() {
        if (instance == null) {
            instance = new TrackerSingleLlV1();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleLlV1 tracker = TrackerSingleLlV1.getInstance();

    }

}
