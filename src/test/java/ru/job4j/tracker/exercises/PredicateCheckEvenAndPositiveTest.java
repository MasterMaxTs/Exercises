package ru.job4j.tracker.exercises;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCheckEvenAndPositiveTest {

    @Test
    public void check() {
        assertTrue(PredicateCheckEvenAndPositive.check(4));
        assertFalse(PredicateCheckEvenAndPositive.check(3));
        assertFalse(PredicateCheckEvenAndPositive.check(-2));
    }
}