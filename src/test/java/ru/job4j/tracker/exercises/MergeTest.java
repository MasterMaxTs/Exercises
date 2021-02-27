package ru.job4j.tracker.exercises;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import ru.job4j.tracker.exercises.Merge.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeTest {

    @Test
    public void collectData() {
        Map<Integer,String> names = new HashMap<>(Map.of(1, "Name1", 2, "Name2"));
        List<User> users = List.of(
                new User(1, "Name1", "Surname1"),
                new User(2, "Name2", "Surname2"),
                new User(3, "Name3", "Surname3"),
                new User(4, "Name4", "Surname4")
        );
        Map<Integer, String> rsl = Merge.collectData(names, users);
        Map<Integer, String> expected = Map.of(
                1, "Name1 Surname1",
                2, "Name2 Surname2",
                3, "Name3 Surname3",
                4, "Name4 Surname4"
        );
        assertThat(rsl, is(expected));
    }
}