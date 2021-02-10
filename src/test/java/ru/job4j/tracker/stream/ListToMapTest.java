package ru.job4j.tracker.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ListToMapTest {
    List<Student> students = new ArrayList<>();
    @Before
    public void setUp() {
        students.add(new Student(75, "Ivanov"));
        students.add(new Student(61, "Petrov"));
    }

    @Test
    public void collectToMap() {
        ListToMap ltm = new ListToMap();
        Map<String, Student> rsl = ltm.collectToMap(students);
        assertThat(rsl.get("Ivanov").getScore(), is(75));
        assertThat(rsl.get("Petrov").getSurname(), is("Petrov"));
    }
}