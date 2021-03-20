package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import ru.job4j.tracker.exercises.stream.GroupMethod.User;

import java.util.List;
import java.util.Map;

public class GroupMethodTest {

    @Test
    public void groupBy() {
        User u1 = new User(29, "Ilya");
        User u2= new User(29, "Sergey");
        User u3= new User(22, "Vasya");
        User u4= new User(20, "Danya");
        User u5= new User(20, "Vitya");
        List<User> users = List.of(u1, u2, u3, u4, u5);
        Map<Integer, List<User>> expect = Map.of(
                29, List.of(u1, u2),
                22, List.of(u3),
                20, List.of(u4, u5)
        );
        assertEquals(expect, GroupMethod.groupBy(users));
    }
}