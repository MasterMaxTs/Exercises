package ru.job4j.tracker.exercises;

import org.junit.Test;
import ru.job4j.exercises.SortMap;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SortMapTest {

    @Test
    public void sort() {
        Map<Integer, Integer> input = Map.of(
                1, 2,
                7, 4,
                5, 5
        );
        Map<Integer, Integer> rsl = SortMap.sort(input);
        Map<Integer, Integer> expected = Map.of(
                7, 4,
                5, 5,
                1, 2);
        assertEquals(rsl, expected);
    }
}