package ru.job4j.tracker.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for(int[] row : list) {
            for(int cell : row) {
                rsl.add(cell);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {2, 4, 6});
        list.add(new int[] {8, 9});
        list.add(new int[] {10});
        List<Integer> integerList = convert(list);
        for (int value : integerList) {
            System.out.print(value);
        }
    }

}
