package ru.job4j.tracker.collection;

import org.junit.Test;
import ru.job4j.tracker.collection.search.Tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Tasks> tasks = Arrays.asList(new Tasks("1", "First Desc"),
                new Tasks("2", "Second Desc"),
                new Tasks("1", "First Desc"));
        Set<String> expected = new HashSet<>(Arrays.asList("1", "2"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }
}