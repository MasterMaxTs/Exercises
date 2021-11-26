package ru.job4j.singleton;

import ru.job4j.tracker.MemTracker;

public class TrackerSingleEager2 {
    private static final MemTracker INSTANCE = new MemTracker();

    private TrackerSingleEager2() {

    }

    public static MemTracker getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleEager2.getInstance());
        System.out.println(TrackerSingleEager2.getInstance());
        System.out.println(TrackerSingleEager2.getInstance());
    }
}
