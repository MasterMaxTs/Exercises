package ru.job4j.tracker.exercises.stream;

import org.junit.Test;
import ru.job4j.exercises.stream.FilterString;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilterStringTest {

    @Test
    public void filter() {
        List<String> input = List.of("Abc.java", "sdf.exe", "abf.java");
        assertEquals(List.of("Abc.java"), FilterString.filter(input));
    }
}