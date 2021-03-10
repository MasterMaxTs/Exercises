package ru.job4j.tracker.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> hml = createMap(left);
        Map<Character, Integer> hmr = createMap(right);
        if (hml.size() != hmr.size()) {
            return false;
        }
        for (Character key :
                hml.keySet()) {
            if (!hml.get(key).equals(hmr.get(key))) {
                return false;
            }
        }
        return true;
    }

    public static Map<Character, Integer> createMap(String string) {
        Map<Character, Integer> hm= new HashMap<>();
        char[]leftChars = string.replaceAll("\\s", "").toCharArray();
        for (Character ch :
                leftChars) {
            hm.putIfAbsent(ch, 1);
            hm.computeIfPresent(ch, (k, v) -> v + 1);
        }
        return hm;
    }
}
