package ru.job4j.exercises.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIterate {
    /**
     * Метод выводит на экран каждый второй элемент массива
     * @param data на входе массив элементов класса Integer
     */
    public static void showArray(Integer[] data) {
        Stream.iterate(0, i -> i < data.length, i -> i + 2)
                .forEach(index -> System.out.print(data[index]));
    }

    /**
     * Метод создает стрим из примитивов в диапазоне заданных значений
     * @param start начальное значение диапазона
     * @param end конечное значение диапазона включительно
     * @return возращает стрим целочисленных значений
     */
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }

    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 5};
        showArray(data);
    }
}
