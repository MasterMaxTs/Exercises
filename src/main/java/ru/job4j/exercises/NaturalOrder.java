package ru.job4j.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NaturalOrder {
    public static Comparator<String> naturalOrder() {
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("e", "a", "c", "b"));
        list.sort(naturalOrder());
        System.out.println(list);
    }
}
