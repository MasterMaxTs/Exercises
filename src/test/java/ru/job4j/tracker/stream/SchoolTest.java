package ru.job4j.tracker.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SchoolTest {
    private List<Student> students = new ArrayList<>();

    @Before
    public void whenSetUp() {
        students.add(new Student(10, "Surname1"));
        students.add(new Student(20, "Surname2"));
        students.add(new Student(30, "Surname3"));
        students.add(new Student(40, "Surname4"));
        students.add(new Student(50, "Surname5"));
        students.add(new Student(60, "Surname6"));
        students.add(new Student(70, "Surname7"));
        students.add(new Student(80, "Surname8"));
        students.add(new Student(90, "Surname9"));
    }

    @Test
    public void whenCollectClass10A() {
        School sc = new School();
        List<Student> rsl = sc.sortedClass(students, s -> s.getScore() >= 70);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(70, "Surname7"));
        expected.add(new Student(80, "Surname8"));
        expected.add(new Student(90, "Surname9"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClass10B() {
        School sc = new School();
        List<Student> rsl = sc.sortedClass(students, s -> s.getScore() >= 50
                                        && s.getScore() < 70);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50, "Surname5"));
        expected.add(new Student(60, "Surname6"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClass10C() {
        School sc = new School();
        List<Student> rsl = sc.sortedClass(students, s -> s.getScore() < 50);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(10, "Surname1"));
        expected.add(new Student(20, "Surname2"));
        expected.add(new Student(30, "Surname3"));
        expected.add(new Student(40, "Surname4"));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenGet10bClassFromMap() {
        School sc = new School();
        List<Student> rsl = sc.getSchoolClass(students, "10B");
        List<Student> expected = new ArrayList<>();
        expected.add(new Student(50, "Surname5"));
        expected.add(new Student(60, "Surname6"));
        assertThat(rsl, is(expected));
    }

    @Test (expected = IllegalArgumentException.class)
    public void whenIncorrectNameClassInput() {
        School sc = new School();
        List<Student> rsl = sc.getSchoolClass(students, "10D");
    }
}