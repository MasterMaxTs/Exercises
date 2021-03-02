package ru.job4j.tracker.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NullFirstMethod {
    public static Comparator<String> nullFirst() {
        return Comparator.nullsFirst(Comparator.naturalOrder());
    }

    public static Comparator<String> nullLast() {
        return Comparator.nullsLast(Comparator.naturalOrder());
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("c", "a", null, "b");
        list.sort(nullFirst());
        System.out.println(list);
        list.sort(nullLast());
        System.out.println(list);
    }
}
