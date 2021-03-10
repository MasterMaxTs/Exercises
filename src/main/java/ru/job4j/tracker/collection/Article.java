package ru.job4j.tracker.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        String OriginFormat = origin.replaceAll("[,.!?;(){}<>]", "");
        List<String> listOrigin = Arrays.asList(OriginFormat.split(" "));
        Set<String> hso = new HashSet<>(listOrigin);
        List<String> listLine = Arrays.asList(line.split(" "));
        Set<String> hsl = new HashSet<>(listLine);
        return hso.containsAll(hsl);
    }
}
