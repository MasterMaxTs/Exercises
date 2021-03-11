package ru.job4j.tracker.exercises.stream;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapForObject {
    /**
     * Метод собирает данные из вложенных списков и складывает в один список
     * @param lists вложенный список
     * @return возвращает список всех элементов
     */
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        return lists.stream()
                .flatMap(sl -> sl.stream())
                .collect(Collectors.toList());
    }
}
