package ru.job4j.tracker.exercises.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToMap {
    /**
     * Метод из входящего потока значений собирает Map
     * @param data входящий поток элементов класса Integer
     * @return возращает Map по правилу: значение равно квадрату ключа
     */
    public static Map<Integer, Integer> collect (Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v));
    }
}
