package ru.job4j.collection;

import ru.job4j.collection.search.Tasks;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Tasks> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Tasks value
                : list) {
            numbers.add(value.getNumber());
        }
        return numbers;
    }
}
