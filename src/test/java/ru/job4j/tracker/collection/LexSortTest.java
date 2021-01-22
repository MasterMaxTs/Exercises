package ru.job4j.tracker.collection;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class LexSortTest {

    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task.",
        };
        String[] output = {
                "1. Task.",
                "2. Task.",
                "10. Task.",
        };
        Arrays.sort(input, new LexSort());
        assertThat(input, is(output));
    }
}