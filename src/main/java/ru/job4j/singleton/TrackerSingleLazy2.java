package ru.job4j.singleton;

import ru.job4j.tracker.MemTracker;

public class TrackerSingleLazy2 {
    private TrackerSingleLazy2() {

    }

    public static MemTracker getInstance() {
        return Holder.INSTANCE;
    }

    private static final class Holder {
        private static final MemTracker INSTANCE = new MemTracker();
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleLazy2.getInstance());
        System.out.println(TrackerSingleLazy2.getInstance());
    }

}
