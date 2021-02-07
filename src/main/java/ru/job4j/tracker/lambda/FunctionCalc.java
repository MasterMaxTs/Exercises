package ru.job4j.tracker.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionCalc {
    public List<Double> diapason(int start, int end, int numberOfSteps ,Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        double delta = (double) (end - start) / numberOfSteps;
        for (int i = 0; i < numberOfSteps ; i++) {
            double rsl = func.apply(start + delta * i);
            result.add(rsl);
        }
        Consumer<Double> consumer = System.out::println;
        result.forEach(consumer);
        return result;
    }

    public static void main(String[] args) {
        new FunctionCalc().diapason(0, 10, 10, x -> Math.pow(3, x));
    }
}
