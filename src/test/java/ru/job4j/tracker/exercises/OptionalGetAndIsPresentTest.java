package ru.job4j.tracker.exercises;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class OptionalGetAndIsPresentTest {

    @Test
    public void whenGetIndex() {
        int[] data = {10, 20, 30};
        assertThat(
                OptionalGetAndIsPresent.get(data, 20), is(1)
        );
    }

    @Test
    public void whenIndexNotExist() {
        int[] data = {10, 20, 30};
        assertThat(
                OptionalGetAndIsPresent.get(data, 40), is(-1)
        );
    }

    @Test
    public void whenInputIsEmpty() {
        int[] data = {};
        assertThat(
                OptionalGetAndIsPresent.get(data, 40), is(-1)
        );
    }
}