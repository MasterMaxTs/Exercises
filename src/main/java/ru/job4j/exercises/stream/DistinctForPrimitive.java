package ru.job4j.exercises.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctForPrimitive {
    /**
     * Метод собирает из входных значений список уникальных чисел
     * @param data массив чисел на входе
     * @return возвращает список уникальных чисел
     */
    public static List<Integer> collect(int[] data) {
        return Arrays.stream(data)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }
}
