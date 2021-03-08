package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import ru.job4j.tracker.exercises.stream.UserMap.User;

import static org.junit.Assert.assertEquals;

public class UserMapTest {

    @Test
    public void map() {
        List<Integer> expect = List.of(10, 25, 34);
        List<User> users = UserMap.map(expect);
        assertEquals(
                expect,
                users.stream().map(User::getAge).collect(Collectors.toList())
        );
    }
}