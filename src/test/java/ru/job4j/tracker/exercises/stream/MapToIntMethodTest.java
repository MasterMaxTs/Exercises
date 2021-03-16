package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MapToIntMethodTest {

    @Test
    public void sum() {
        assertEquals(
                294, MapToIntMethod.sum(List.of('a', 'b', 'c'))
        );
    }
}