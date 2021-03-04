package ru.job4j.tracker.exercises;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;

public class MRFunctionTest {

    @Test
    public void apply() {
        Function<Double, Double> func = MRFunction.apply();
        assertEquals(4.0, func.apply(16.0), 0.01);
        assertEquals(5.0, func.apply(25.0), 0.01);
    }
}