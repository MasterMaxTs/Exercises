package ru.job4j.singleton;

import ru.job4j.tracker.MemTracker;

public class TrackerSingleLazy1 {
    private static MemTracker instance;

    private TrackerSingleLazy1() {

    }

    public static MemTracker getInstance() {
        if (instance == null) {
            instance = new MemTracker();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleLazy1.getInstance());
        System.out.println(TrackerSingleLazy1.getInstance());
        System.out.println(TrackerSingleLazy1.getInstance());
    }

}
