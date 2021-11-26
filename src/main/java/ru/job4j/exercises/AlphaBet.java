package ru.job4j.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AlphaBet {
    public static String reformat(String s) {
        String[] subStr = s.split("");
        List<String> list = Arrays.asList(subStr);
        list.sort(Comparator.naturalOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.insert(i, list.get(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "websecurityconfigureradapter";
        System.out.println("Начальная строка:" + str);
        System.out.println("Строка по возрастанию букв: " + reformat(str));
    }
}
