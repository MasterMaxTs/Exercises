package ru.job4j.tracker.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionSqrtTest {

    @Test
    public void calculate() {
        assertEquals(FunctionSqrt.calculate(9), 3, 0.01);
        assertEquals(FunctionSqrt.calculate(16), 4, 0.01);
    }
}