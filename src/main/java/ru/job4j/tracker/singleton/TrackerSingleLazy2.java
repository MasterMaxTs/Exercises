package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingleLazy2 {
    private TrackerSingleLazy2() {

    }

    public static Tracker getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final Tracker INSTANCE = new Tracker();
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleLazy2.getInstance());
        System.out.println(TrackerSingleLazy2.getInstance());
    }

}
