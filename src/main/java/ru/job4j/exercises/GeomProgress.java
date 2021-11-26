package ru.job4j.exercises;

import java.util.ArrayList;
import java.util.List;

public class GeomProgress {
    public static int generateAndSum(int first, int denominator, int count) {
        List<Integer> list = new ArrayList<>(count);
        list.add(first);
        int sum = list.get(0);
        for (int i = 2; i <= count; i++) {
            list.add(first * (int) Math.pow(denominator, i - 1));
            sum += list.get(i - 1);
        }
        for (int value
                : list) {
            System.out.print(value + " ");
        }

        System.out.println("Сумма членов: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        generateAndSum(1, 3, 10);
        generateAndSum(1, -1, 10);
    }
}
