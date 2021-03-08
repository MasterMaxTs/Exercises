package ru.job4j.tracker.exercises.stream;

import java.util.List;

public class ReductionWithTwoArguments {
    /**
     * Метод позволяет вычислить сумму всех элементов списка,
     * помноженную на 5
     * @param list список целых чисел на входе
     * @return возвращает сумму всех элементов списка,
     * помноженную на 5
     */
    public static Integer collect (List<Integer> list) {
        return list.stream()
                    .reduce(5, (f, s) -> f * s);

    }
}
