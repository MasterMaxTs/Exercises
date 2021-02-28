package ru.job4j.tracker.exercises;

import java.util.*;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        String strLowerCase = str.toLowerCase();
        String[] strArr = strLowerCase.split(" ");
        StringBuilder resultStr = new StringBuilder();
        for (String value :
                strArr) {
            resultStr.append(value);
        }
        char[] charArr = resultStr.toString().toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (Character ch :
                charArr) {
            map.computeIfPresent(ch, (k, v) -> v + 1);
            map.computeIfAbsent(ch, value -> 1);
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
