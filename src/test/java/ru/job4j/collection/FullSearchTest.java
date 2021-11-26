package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.search.Tasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        List<Tasks> tasks = List.of(new Tasks("1", "First Desc"),
                                    new Tasks("2", "Second Desc"),
                                    new Tasks("1", "First Desc"));
        Set<String> expected = new HashSet<>(List.of("1", "2"));
        assertThat(FullSearch.extractNumber(tasks), is(expected));
    }
}