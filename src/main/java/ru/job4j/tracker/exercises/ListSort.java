package ru.job4j.tracker.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static List<String> sort (List<String> data) {
        List<String> sortedList = new ArrayList<>(data);
        sortedList.sort(Comparator.nullsLast(Comparator.reverseOrder()));
        return sortedList;
    }
}
