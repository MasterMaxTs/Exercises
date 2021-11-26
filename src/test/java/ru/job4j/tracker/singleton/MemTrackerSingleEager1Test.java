package ru.job4j.tracker.singleton;

import org.junit.Test;
import ru.job4j.tracker.MemTracker;

import static org.junit.Assert.*;

public class MemTrackerSingleEager1Test {

    @Test
    public void whenWeAddTwoObjTracker() {
        TrackerSingleEager1[] array = TrackerSingleEager1.values();
        MemTracker[] memTrackers = {array[0].getTracker(),
                              array[0].getTracker(),
        };
        MemTracker expected = array[0].getTracker();
        for (MemTracker rsl : memTrackers) {
            assertSame(expected, rsl);
        }
    }
}