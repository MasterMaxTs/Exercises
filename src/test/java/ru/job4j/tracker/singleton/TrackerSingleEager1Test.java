package ru.job4j.tracker.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;
import static org.junit.Assert.*;

public class TrackerSingleEager1Test {

    @Test
    public void whenWeAddTwoObjTracker() {
        TrackerSingleEager1[] array = TrackerSingleEager1.values();
        Tracker[] trackers = { array[0].getTracker(),
                               array[0].getTracker(),
        };
        Tracker expected = array[0].getTracker();
        for(Tracker rsl : trackers) {
            assertSame(expected, rsl);
        }
    }
}