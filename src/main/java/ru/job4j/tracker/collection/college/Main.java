package ru.job4j.tracker.collection.college;

import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Student, Set<Subject>> students = Map.of(
                new Student("Oleg", "00001", "61"),
                Set.of(
                        new Subject("Math", 60),
                        new Subject("English", 20)
                ),
                new Student("Timur", "00002", "62"),
                Set.of(
                        new Subject("Math", 90),
                        new Subject("English", 46)
                ),
                new Student("Maxim", "00003", "63"),
                Set.of(
                        new Subject("Math", 87),
                        new Subject("English", 69)
                ));
        System.out.println(students);
        College college = new College(students);
        Student search = college.findByAccount("00003");
        System.out.println("Найденный студент : " + search);
        Subject math = college.findBySubjectName("00003", "Math");
        System.out.println("Оценка по " + math.getName() + " : " + math.getScore());
    }
}
