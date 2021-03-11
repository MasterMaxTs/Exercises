package ru.job4j.tracker.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String originFormat = origin.replaceAll("[,.!?;:(){}<>]", "");
        String[] originArr = originFormat.split(" ");
        Set<String> hs = new HashSet<>(Arrays.asList(originArr));
        String[] lineArr = line.split(" ");
        for (String str
                : lineArr) {
            if (!hs.contains(str)) {
                return false;
            }
        }
        return true;
    }
}
