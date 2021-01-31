package ru.job4j.tracker.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("K1/SK1");
        List<String> expected = Arrays.asList("K1", "K1/SK1");
        List<String> rsl = Departments.fillGaps(input);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("K1", "K1/SK1");
        List<String> expected = Arrays.asList("K1", "K1/SK1");
        List<String> rsl = Departments.fillGaps(input);
        assertThat(rsl, is(expected));
    }
}