package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class ListToMapTest {
    private List<Student> students = new ArrayList<>();

    @Before
    public void setUp() {
        students.add(new Student(75, "Ivanov"));
        students.add(new Student(61, "Petrov"));
        students.add(new Student(32, "Sidorov"));
    }

    @Test
    public void collectToMap() {
        ListToMap ltm = new ListToMap();
        Map<String, Student> rsl = ltm.collectToMap(students);
        assertThat(rsl.get("Ivanov").getScore(), is(75));
        assertThat(rsl.get("Petrov").getSurname(), is("Petrov"));
    }

    @Test
    public void whenListContainsDuplicateThenCollectToMap() {
        students.add(new Student(75, "Ivanov"));
        ListToMap ltm = new ListToMap();
        Map<String, Student> rsl = ltm.collectToMap(students);
        Collection<Student> stc = rsl.values();
        assertThat(stc.stream().map(Student::getScore)
                               .filter(i -> i == 75).count(), is(1L));
        assertThat(rsl.values().size(), is(3));

    }
}