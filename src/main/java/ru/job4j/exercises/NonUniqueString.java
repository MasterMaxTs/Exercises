package ru.job4j.exercises;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s
                : strings) {
            map.computeIfPresent(s, (k, v) -> true);
            map.computeIfAbsent(s, v -> false);
        }
        return map;
    }
}
