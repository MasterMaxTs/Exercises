package ru.job4j.tracker.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class NumbersSort {
    public static void sortDescByNumber(String[] desc) {
        Comparator<String> comp = (left, right) -> {
            System.out.println("Execute comparator \"sort descending by number\"");
            int first = Integer.parseInt(left.substring(0, left.indexOf(".")));
            int second = Integer.parseInt(right.substring(0, right.indexOf(".")));
            return second - first;
        };
        Arrays.sort(desc, comp);
    }

    public static void sortAscByName(String[] desc) {
        Comparator<String> comp = (left, right) -> {
            System.out.println("Execute comparator \"sort ascending by name\"");
            String first = left.substring(left.indexOf(".") + 1);
            String second = right.substring(right.indexOf(".") + 1);
            return first.compareTo(second);
        };
        Arrays.sort(desc, comp);
    }

    public static void showInfo(String[] array) {
        for (String s :
                array) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] input = {
                "1. Atask",
                "11. Dtask",
                "4. Btask",
        };
        showInfo(input);
        sortDescByNumber(input);
        showInfo(input);
        sortAscByName(input);
        showInfo(input);
    }
}
