package ru.job4j.tracker.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerList {
    public static void main(String[] args) {
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = -3; i < 4 ; i++) {
            digits.add(i);
        }
        digits.forEach(System.out::print);
        System.out.println();
        List<Integer> positiveDigits = digits.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
        positiveDigits.forEach(System.out::print);
    }
}
