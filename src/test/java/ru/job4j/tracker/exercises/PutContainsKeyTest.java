package ru.job4j.tracker.exercises;

import org.junit.Test;
import ru.job4j.exercises.PutContainsKey;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static ru.job4j.exercises.PutContainsKey.User;

public class PutContainsKeyTest {

    @Test
    public void addNewElementWithoutCheck() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(1, "Name3");
        List<User> users = List.of(one, two, three);
        Map<Integer, User> rsl = PutContainsKey.addNewElementWithoutCheck(users);
        assertThat(rsl, is(Map.of(1, three, 2, two)));
    }

    @Test
    public void addNewElementWithCheck() {
        User one = new User(1, "Name1");
        User two = new User(2, "Name2");
        User three = new User(1, "Name3");
        List<User> users = List.of(one, two, three);
        Map<Integer, User> rsl = PutContainsKey.addNewElementWithoutCheck(users);
        assertThat(rsl, is(Map.of(1, one, 2, two)));
    }
}