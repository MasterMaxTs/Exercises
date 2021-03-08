package ru.job4j.tracker.exercises.stream;

import java.util.stream.Stream;

public class StreamIterate {
    /**
     * Метод выводит на экран каждый второй элемент массива
     * @param data на входе массив элементов класса Integer
     */
    public static void showArray (Integer[] data) {
        Stream.iterate(0, i -> i < data.length, i -> i + 2)
                .forEach(index -> System.out.print(data[index]));
    }

    public static void main(String[] args) {
        Integer[] data = {1, 2, 3 ,4 ,5};
        showArray(data);
    }
}
