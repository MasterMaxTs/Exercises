package ru.job4j.exercises.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMap {
    /**
     * Метод из входящего потока значений собирает Map
     * @param data входящий поток элементов класса Integer
     * @return возращает Map по правилу: значение равно квадрату ключа
     */
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v));
    }

    /**
     * Метод из входящего потока, в котором могут быть дубликаты значений,
     * собирает Map
     * @param data входящий поток элементов класса Integer
     * @return озращает Map по правилу: значение равно квадрату ключа
     */
    public static Map<Integer, Integer> collectWhenDuplicate(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev));
    }

    /*Сборка в LinkedHashMap*/
    public static Map<Integer, Integer> collectToLinkedMap(Stream<Integer> data) {
        return data.collect(
                Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev, LinkedHashMap::new)
        );
    }
}
