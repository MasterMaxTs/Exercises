package ru.job4j.tracker.exercises;

import org.junit.Test;
import ru.job4j.exercises.ComputeIfPresent;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ComputeIfPresentTest {

    @Test
    public void collectData() {
        Map<Integer, String> name = new HashMap<>(Map.of(1, "Bill", 2, "Donald"));
        Map<Integer, String> surname = new HashMap<>(Map.of(1, "Clinton", 2, "Trump"));
        Map<Integer, String> rsl = ComputeIfPresent.collectData(name, surname);
        Map<Integer, String> expected = Map.of(1, "Bill Clinton", 2, "Donald Trump");
        assertThat(rsl, is(expected));
    }
}