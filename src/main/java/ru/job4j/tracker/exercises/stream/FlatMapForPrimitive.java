package ru.job4j.tracker.exercises.stream;

import java.util.Arrays;

/**
 * Класс демонстрирует работу с потоками, содержащими вложенные структуры
 */
public class FlatMapForPrimitive {

    /**
     * Метод позволяет произвести расчет суммы элементов матрицы
     * @param matrix матрица целочисленных значений на входе
     * @return сумму элементов матрицы
     */
    public static int sum(int[][] matrix) {
        return Arrays.stream(matrix)
                .flatMapToInt(sm -> Arrays.stream(sm))
                .sum();
    }
}
