package ru.job4j.tracker;

public class TrackerSingleLlV2 {
    private TrackerSingleLlV2() {

    }

    public static TrackerSingleLlV2 getInstance() {
        return Holder.INSTANCE;
    }

    public static final class Holder {
        public static final TrackerSingleLlV2 INSTANCE = new TrackerSingleLlV2();
    }

    public Item add(Item model) {
        return model;
    }

    public static void main(String[] args) {
        TrackerSingleLlV2 tracker = TrackerSingleLlV2.getInstance();
    }
}
