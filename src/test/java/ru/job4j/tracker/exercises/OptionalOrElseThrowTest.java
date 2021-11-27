package ru.job4j.tracker.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import ru.job4j.exercises.OptionalOrElseThrow.User;
import ru.job4j.exercises.OptionalOrElseThrow.UserNotFoundException;

import java.util.List;

public class OptionalOrElseThrowTest {

    @Test
    public void whenLoginExist() {
        List<User> users = List.of(
                new User("loginOne"),
                new User("loginTwo")
        );
        String rsl = UserNotFoundException.orElseThrow(users, "loginTwo").getLogin();
        String expected = "loginTwo";
        assertEquals(rsl, expected);
    }

    @Test (expected = UserNotFoundException.class)
    public void whenLoginNotExist() {
        List<User> users = List.of(
                new User("loginOne"),
                new User("loginTwo")
        );
        User rsl = UserNotFoundException.orElseThrow(users, "loginThree");
    }

}