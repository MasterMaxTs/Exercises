package ru.job4j.tracker.exercises;

import org.junit.Test;
import ru.job4j.exercises.PutIfAbsent;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static ru.job4j.exercises.PutIfAbsent.User;

public class PutIfAbsentTest {

    @Test
    public void addNewElement() {
        Map<Integer, User> map = new HashMap<>(
                Map.of(
                1, new User(1, "Name1"),
                2, new User(2, "Name2")
            )
        );
        PutIfAbsent pt = new PutIfAbsent(map);
        boolean rsl = pt.addNewElement(new User(2, "Name3"));
        assertThat(rsl, is(false));
    }

    @Test
    public void whenAddNewElementThenTrue() {
        Map<Integer, User> map = new HashMap<>(
                Map.of(
                        1, new User(1, "Name1"),
                        2, new User(2, "Name2")
                )
        );
        PutIfAbsent pt = new PutIfAbsent(map);
        User user = new User(3, "Name3");
        boolean rsl = pt.addNewElement(user);
        assertThat(rsl, is(true));
    }
}