package ru.job4j.tracker.exercises.stream;

import org.junit.Test;
import ru.job4j.exercises.stream.CollectorClass;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectorClassTest {

    @Test
    public void collect() {
        assertEquals(
                List.of(1, 2, 3),
                CollectorClass.collect(List.of(1, 2, 3))
        );
    }
}