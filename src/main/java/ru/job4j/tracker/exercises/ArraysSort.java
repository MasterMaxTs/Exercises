package ru.job4j.tracker.exercises;

import java.util.Arrays;

public class ArraysSort {
    public static long[] sort (long[] data) {
        Arrays.sort(data);
        return data;
    }

    public static void main(String[] args) {
        long[] data = {10000000, 4400000, 6000};
        System.out.println(Arrays.toString(sort(data)));
    }
}
