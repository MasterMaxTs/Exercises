package ru.job4j.tracker.exercises;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConcordanceTest {

    @Test
    public void collectCharacters() {
        String s = "Hello world";
        Map<Character, List<Integer>> rsl = Concordance.collectCharacters(s);
        Map<Character, List<Integer>> expected = new HashMap<>(
                Map.of(
                        'H', List.of(0),
                        'e', List.of(1),
                        'l', List.of(2, 3, 8),
                        'o', List.of(4, 6),
                        'w', List.of(5),
                        'r', List.of(7),
                        'd', List.of(9)
                )
        );
        assertThat(rsl, is(expected));
     }
}