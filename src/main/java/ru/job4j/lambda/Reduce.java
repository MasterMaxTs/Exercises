package ru.job4j.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Reduce {
    public static int summation(int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer left, Integer right) {
                return left + right;
            }
        };
        Supplier<Integer> initValue = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 0;
            }
        };
        return loop(to, func, initValue);

    }

    public static int multiplication(int to) {
        BiFunction<Integer, Integer, Integer> func = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer left, Integer right) {
                return left * right;
            }
        };
        Supplier<Integer> initValue = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 1;
            }
        };
        return loop(to, func, initValue);
    }

    /**
     * Универсальный метод для вычисления суммы и произведения чисел от 1 до to
     */
    private static int loop(int to,
                            BiFunction<Integer, Integer, Integer> func,
                            Supplier<Integer> initValue) {
        int rsl = initValue.get();
        for (int i = 1; i <= rsl; i++) {
            rsl = func.apply(i, rsl);
        }
        return rsl;
    }
}
