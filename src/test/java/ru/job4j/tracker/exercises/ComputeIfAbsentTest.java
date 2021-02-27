package ru.job4j.tracker.exercises;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import ru.job4j.tracker.exercises.ComputeIfAbsent.User;

public class ComputeIfAbsentTest {

    @Test
    public void collectData() {
        Map<Integer, String> names = Map.of(1, "", 2, "");
        List<User> users = List.of(
                new User(1, "Name1"),
                new User(2, "Name2"),
                new User(3, "Name3"),
                new User(4, "Name4")
        );
        Map<Integer, String> rsl = ComputeIfAbsent.collectData(names, users);
        Map<Integer, String> expected = Map.of(
                4, "Name4", 1, "Name1", 2, "Name2", 3, "Name3");
        assertThat(rsl, is(expected));
    }
}