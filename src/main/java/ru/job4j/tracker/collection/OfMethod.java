package ru.job4j.tracker.collection;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMethod {
    public static void main(String[] args) {
        List<Integer> digits = List.of(1, 2, 3);
        digits.forEach(System.out::print);
        System.out.println();
        Set<Integer> setDigits = Set.of(5, 3, 8);
        setDigits.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
        System.out.println();
        Map<String, Integer> map = Map.of("first", 1, "second", 2);
        map.forEach((v, k) -> System.out.printf("%s %s", v, k));
    }
}
