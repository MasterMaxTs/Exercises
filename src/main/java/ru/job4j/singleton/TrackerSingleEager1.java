package ru.job4j.singleton;

import ru.job4j.tracker.MemTracker;

public enum TrackerSingleEager1 {
    INSTANCE;
    private final MemTracker memTracker = new MemTracker();
    public MemTracker getTracker() {
        return memTracker;
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleEager1.INSTANCE.getTracker());
        System.out.println(TrackerSingleEager1.INSTANCE.getTracker());
    }
}
