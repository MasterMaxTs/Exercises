package ru.job4j.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortBySetUsingComparator {
    /**
     * Метод позволяет получать отсортированное множество
     * строк в лексографическом порядке по убыванию
     * @ param на вход подается list строк
     * */
    public static Set<String> sort(List<String> list) {
        Set<String> sortedSet = new TreeSet<>(Comparator.reverseOrder());
        sortedSet.addAll(list);
        return sortedSet;
    }

    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "4", "5", "2", "3", "1");
        list.forEach(System.out::print);
        System.out.println();
        sort(list).forEach(System.out::print);
    }
}
