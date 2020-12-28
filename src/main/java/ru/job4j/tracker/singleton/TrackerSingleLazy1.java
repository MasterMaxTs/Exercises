package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingleLazy1 {
    private static Tracker instance;

    private TrackerSingleLazy1() {

    }

    public static Tracker getInstance() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleLazy1.getInstance());
        System.out.println(TrackerSingleLazy1.getInstance());
        System.out.println(TrackerSingleLazy1.getInstance());
    }

}
