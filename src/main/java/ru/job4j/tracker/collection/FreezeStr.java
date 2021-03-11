package ru.job4j.tracker.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        Map<Character, Integer> hm = new HashMap<>();
        char[] leftChars = left.toCharArray();
        for (Character ch
                : leftChars) {
            hm.computeIfPresent(ch, (k, v) -> v + 1);
            hm.putIfAbsent(ch, 1); }
        char[] rightChars = right.toCharArray();
        for (Character ch
                : rightChars) {
            if (!hm.containsKey(ch)) {
                return false;
            }
            if (hm.get(ch) == 1) {
                hm.remove(ch);
                continue;
            }
            hm.replace(ch, hm.get(ch) - 1);
        }
        return hm.isEmpty();
    }
}