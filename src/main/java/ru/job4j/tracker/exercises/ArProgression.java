package ru.job4j.tracker.exercises;

import java.util.ArrayList;
import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        List<Integer> digits = new ArrayList<>(data);
        int ds = digits.size() - 1;
        int sum = digits.get(0) + digits.get(ds);
        for (int i = 1; i < ds; i++) {
            if (digits.get(ds - i) != 0.5 * (digits.get(ds - i - 1) + digits.get(ds - i + 1))) {
                System.out.println("\nInput data is not arithmetic progression!");
                return 0;
            }
            sum += digits.get(i);
        }
        System.out.println("\nСумма чисел арифметической прогрессии: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> data = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        data.forEach(el -> System.out.print(el + ", "));
        checkData(data);
        data = List.of(
                1, 6, 11, 15, 21,
                26, 31, 36, 41, 46
        );
        data.forEach(el -> System.out.print(el + ", "));
        checkData(data);
    }
}
