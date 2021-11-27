package ru.job4j.tracker.exercises;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import ru.job4j.exercises.Farm;

import java.util.HashMap;
import java.util.Map;

public class FarmTest {

    @Test
    public void sumLegs() {
        Map<Farm.Animal, Integer> animals = new HashMap<>(
                Map.of(
                        new Farm.Animal("chicken", 2), 5,
                        new Farm.Animal("cow", 4), 2,
                        new Farm.Animal("pig", 4), 8,
                        new Farm.Animal("duck", 2), 10
                )
        );
        int rsl = Farm.sumLegs(animals);
        assertThat(rsl, is(70));
    }
}