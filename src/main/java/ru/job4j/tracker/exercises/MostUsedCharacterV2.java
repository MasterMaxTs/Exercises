package ru.job4j.tracker.exercises;

import java.util.*;

public class MostUsedCharacterV2 {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        String resultStr = str.toLowerCase().replaceAll("\\s", "");
        char[] charArr = resultStr.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch
                : charArr) {
            map.computeIfPresent(ch, (k, v) -> v + 1);
            map.computeIfAbsent(ch, v -> 1);
        }
        Map<Integer, Character> sortedMap = new TreeMap<>();
        for (Map.Entry entry : map.entrySet()) {
            sortedMap.put((Integer) entry.getValue(), (Character) entry.getKey());
        }
        return sortedMap.get(Collections.max(sortedMap.keySet()));
    }
}
