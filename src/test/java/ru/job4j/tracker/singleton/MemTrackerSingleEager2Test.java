package ru.job4j.tracker.singleton;

import org.junit.Test;
import ru.job4j.tracker.MemTracker;

import static org.junit.Assert.*;

public class MemTrackerSingleEager2Test {

    @Test
    public void whenWeAddThreeObjTracker() {
        MemTracker[] memTrackers = {TrackerSingleEager2.getInstance(),
                              TrackerSingleEager2.getInstance(),
                              TrackerSingleEager2.getInstance(),
        };
        MemTracker expected = TrackerSingleEager2.getInstance();
        for (MemTracker rsl : memTrackers) {
            assertSame(expected, rsl);
        }
    }
}