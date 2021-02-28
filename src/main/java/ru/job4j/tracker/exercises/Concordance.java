package ru.job4j.tracker.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        char[] charArr = s.replaceAll("\\s", "").toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            map.putIfAbsent(charArr[i], new ArrayList<>());
            map.get(charArr[i]).add(i);
        }
        return map;
    }
}
