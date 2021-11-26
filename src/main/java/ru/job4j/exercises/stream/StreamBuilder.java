package ru.job4j.exercises.stream;

import java.util.stream.Stream;

/**
 * Класс позволяет создать стрим выборочно из нескольких элементов.
 */
public class StreamBuilder {
    /**
     * Метод создает стрим из произвольных элементов входящего массива
     * @param data массив чисел класса Integer
     * @return возвращает стрим из первого и последнего элемента
     * во входящем массиве
     */
    public static Stream<Object> createStream(Integer[] data) {
        return Stream
                .builder()
                .add(data[0])
                .add(data[data.length - 1])
                .build();
    }
}
