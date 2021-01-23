package ru.job4j.tracker.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import static org.junit.Assert.*;

public class TrackerSingleEager2Test {

    @Test
    public void whenWeAddThreeObjTracker() {
        Tracker[] trackers = {TrackerSingleEager2.getInstance(),
                              TrackerSingleEager2.getInstance(),
                              TrackerSingleEager2.getInstance(),
        };
        Tracker expected = TrackerSingleEager2.getInstance();
        for (Tracker rsl : trackers) {
            assertSame(expected, rsl);
        }
    }
}