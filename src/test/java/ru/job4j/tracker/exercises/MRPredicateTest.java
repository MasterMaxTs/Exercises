package ru.job4j.tracker.exercises;

import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class MRPredicateTest {

    @Test
    public void predicate() {
        Predicate<String> pre = MRPredicate.predicate();
        assertTrue(pre.test(""));
        assertFalse(pre.test("g"));
    }
}