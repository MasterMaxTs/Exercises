package ru.job4j.tracker.exercises;

import java.util.function.Function;

public class FunctionSqrt {
    public static double calculate(double x) {
        return calculate(y -> Math.sqrt(y), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
