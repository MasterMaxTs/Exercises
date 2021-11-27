package ru.job4j.tracker.exercises;

import org.junit.Test;
import ru.job4j.exercises.NonUniqueString;

import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class NonUniqueStringTest {

    @Test
    public void checkData() {
        String[] strings = {"a", "b", "c", "a", "c", "a"};
        Map<String, Boolean> rsl = NonUniqueString.checkData(strings);
        Map<String, Boolean> expected = Map.of(
                "a", true,
                "b", false,
                "c", true
        );
        assertThat(rsl, is(expected));
    }
}