package ru.job4j.tracker.exercises;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        /*Приводим строку к нижнему регистру и удаляем пробелы*/
        String resultStr = str.toLowerCase().replaceAll("\\s", "");
        char[] charArr = resultStr.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (Character ch :
                charArr) {
            map.computeIfPresent(ch, (k, v) -> v + 1);
            map.computeIfAbsent(ch, v -> 1);
        }
        Collection<Integer> col = map.values();
        int max = Collections.max(col);
        for (Character key :
                map.keySet()) {
            if (map.get(key) == max) {
                return key;
            }
        }
        return rsl;
    }
}
