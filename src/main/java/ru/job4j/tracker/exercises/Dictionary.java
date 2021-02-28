package ru.job4j.tracker.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s :
                strings) {
            String firstChar = s.substring(0, 1);
            map.putIfAbsent(firstChar, new ArrayList<>());
            map.get(firstChar).add(s);
        }
        return map;
    }
}
