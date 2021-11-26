package ru.job4j.singleton;

import org.junit.Test;
import ru.job4j.tracker.MemTracker;

import static org.junit.Assert.*;

public class MemTrackerSingleLazy2Test {

    @Test
    public void whenWeAddTwoObjTracker() {
        MemTracker[] memTrackers = {TrackerSingleLazy2.getInstance(),
                              TrackerSingleLazy2.getInstance(),
        };
        MemTracker expected = TrackerSingleLazy2.getInstance();
        for (MemTracker rsl : memTrackers) {
            assertSame(expected, rsl);
        }
    }
}