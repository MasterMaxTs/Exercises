package ru.job4j.tracker.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import static org.junit.Assert.*;

public class TrackerSingleLazy1Test {

    @Test
    public void whenWeAddThreeObjTracker() {
        Tracker[] trackers = {  TrackerSingleLazy1.getInstance(),
                                TrackerSingleLazy1.getInstance(),
                                TrackerSingleLazy1.getInstance(),
        };
        Tracker expected = TrackerSingleLazy1.getInstance();
        for (Tracker rsl : trackers) {
            assertSame(expected, rsl);
        }
    }
}