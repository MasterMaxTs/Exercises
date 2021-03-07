package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class CollectorAriphmeticTest {

    @Test
    public void collect() {
        assertThat(
                CollectorAriphmetic.collect(
                List.of(1, 2, 3, 4, 5)),
                is(120)
        );
    }
}