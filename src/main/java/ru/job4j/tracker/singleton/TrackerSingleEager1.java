package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public enum TrackerSingleEager1 {
    INSTANCE();
    private final Tracker tracker;
    TrackerSingleEager1() {
        this.tracker = new Tracker();
    }
    public Tracker getTracker() {
        return tracker;
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleEager1.INSTANCE.getTracker());
        System.out.println(TrackerSingleEager1.INSTANCE.getTracker());
    }
}
