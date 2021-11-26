package ru.job4j.singleton;

import org.junit.Test;
import ru.job4j.tracker.MemTracker;

import static org.junit.Assert.*;

public class MemTrackerSingleLazy1Test {

    @Test
    public void whenWeAddThreeObjTracker() {
        MemTracker[] memTrackers = {TrackerSingleLazy1.getInstance(),
                              TrackerSingleLazy1.getInstance(),
                              TrackerSingleLazy1.getInstance(),
        };
        MemTracker expected = TrackerSingleLazy1.getInstance();
        for (MemTracker rsl : memTrackers) {
            assertSame(expected, rsl);
        }
    }
}