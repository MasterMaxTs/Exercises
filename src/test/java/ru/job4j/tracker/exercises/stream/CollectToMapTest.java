package ru.job4j.tracker.exercises.stream;

import org.junit.Test;
import ru.job4j.exercises.stream.CollectToMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class CollectToMapTest {

    @Test
    public void collect() {
        Stream<Integer> data = List.of(2, 3).stream();
        Map<Integer, Integer> expect = Map.of(2, 4, 3, 9);
        Map<Integer, Integer> rsl = CollectToMap.collect(data);
        assertEquals(expect, rsl);
    }

    @Test
    public void collectWhenDuplicate() {
        Stream<Integer> data = List.of(2, 3, 4, 2).stream();
        Map<Integer, Integer> expect = Map.of(2, 4, 3, 9, 4, 16);
        Map<Integer, Integer> rsl = CollectToMap.collectWhenDuplicate(data);
        assertEquals(expect, rsl);
    }

    @Test
    public void whenCollectLinkedHashMap() {
        List<Integer> data = List.of();
        String expect = "java.util.LinkedHashMap";
        String rsl = CollectToMap.collectToLinkedMap(data.stream()).getClass().getName();
        assertEquals(expect, rsl);
    }
}