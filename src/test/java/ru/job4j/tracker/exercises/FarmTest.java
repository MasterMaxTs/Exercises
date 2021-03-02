package ru.job4j.tracker.exercises;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import ru.job4j.tracker.exercises.Farm.Animal;

import java.util.HashMap;
import java.util.Map;

public class FarmTest {

    @Test
    public void sumLegs() {
        Map<Animal, Integer> animals = new HashMap<>(
                Map.of(
                        new Animal("chicken", 2), 5,
                        new Animal("cow", 4), 2,
                        new Animal("pig", 4), 8,
                        new Animal("duck", 2), 10
                )
        );
        int rsl = Farm.sumLegs(animals);
        assertThat(rsl, is(70));
    }
}