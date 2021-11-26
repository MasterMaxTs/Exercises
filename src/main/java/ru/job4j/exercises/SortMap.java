package ru.job4j.exercises;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {
    public static Map<Integer, Integer> sort(Map<Integer, Integer> map) {
        Map<Integer, Integer> rsl = new TreeMap<>(Comparator.reverseOrder());
        rsl.putAll(map);
        return rsl;
    }
}
