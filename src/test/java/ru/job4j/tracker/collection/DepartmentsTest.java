package ru.job4j.tracker.collection;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = List.of("K1/SK1");
        List<String> expected = List.of("K1", "K1/SK1");
        List<String> rsl = Departments.fillGaps(input);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("K1", "K1/SK1");
        List<String> expected = List.of("K1", "K1/SK1");
        List<String> rsl = Departments.fillGaps(input);
        assertThat(rsl, is(expected));
    }
}