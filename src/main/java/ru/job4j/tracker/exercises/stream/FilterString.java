package ru.job4j.tracker.exercises.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterString {

    /**
     * Метод фильтрует строки по нескольким правилам
     * @param data список строк на входе
     * @return возвращает список строк, начинающихся на "A"
     * и заканчивающихся на ".java"
     */
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(s -> s.startsWith("A"))
                .filter(s -> s.endsWith(".java"))
                .collect(Collectors.toList());
    }
}
