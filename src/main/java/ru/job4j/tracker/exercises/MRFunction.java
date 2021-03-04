package ru.job4j.tracker.exercises;

import java.util.function.Function;

public class MRFunction {
    /**
     * Метод создает функцию вычисления корня квадратного из числа
     * @return возвращает ссылку на метод sqrt класса Math
     */
    public static Function<Double, Double> apply () {
        return Math::sqrt;
    }

}
