package ru.job4j.tracker.exercises;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListSortTest {

    @Test
    public void sort() {
        List<String> data = Arrays.asList(
                "apple", "cucumber", null, "garlic", null, "banana"
        );
        List<String> rsl = ListSort.sort(data);
        List<String> expected = Arrays.asList(
                "garlic", "cucumber", "banana", "apple", null, null
        );
        assertEquals(rsl, expected);
    }
}