package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingleEager2 {
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingleEager2() {

    }

    public static Tracker getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleEager2.getInstance());
        System.out.println(TrackerSingleEager2.getInstance());
        System.out.println(TrackerSingleEager2.getInstance());
    }
}
