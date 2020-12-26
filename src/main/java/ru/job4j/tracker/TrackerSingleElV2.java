package ru.job4j.tracker;

public class TrackerSingleElV2 {
    public static final TrackerSingleElV2 INSTANCE = new TrackerSingleElV2();

    private TrackerSingleElV2() {

    }

    public static TrackerSingleElV2 getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleElV2 tracker = TrackerSingleElV2.getInstance();
    }
}
