package ru.job4j.tracker.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import static org.junit.Assert.*;

public class TrackerSingleLazy2Test {

    @Test
    public void whenWeAddTwoObjTracker() {
        Tracker[] trackers = {TrackerSingleLazy2.getInstance(),
                              TrackerSingleLazy2.getInstance(),
        };
        Tracker expected = TrackerSingleLazy2.getInstance();
        for (Tracker rsl : trackers) {
            assertSame(expected, rsl);
        }
    }
}