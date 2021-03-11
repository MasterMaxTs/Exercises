package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlatMapForObjectTest {

    @Test
    public void flatMap() {
        List<List<Integer>> lists = List.of(List.of(1, 2), List.of(3, 4, 5));
        List<Integer> expect = List.of(1, 2, 3, 4, 5);
        List<Integer> rsl = FlatMapForObject.flatMap(lists);
        assertEquals(expect, rsl);
    }
}