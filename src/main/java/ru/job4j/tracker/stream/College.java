package ru.job4j.tracker.stream;

import ru.job4j.tracker.collection.college.Student;
import ru.job4j.tracker.collection.college.Subject;

import java.util.Map;
import java.util.Set;

public class College {
    private Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Student findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(a -> a.getAccount().equals(account))
                .findFirst()
                .orElse(null);
    }

    public Subject findBySubjectName(String account, String name) {
        Student s = findByAccount(account);
        if (s != null) {
            return students.get(s).stream()
                    .filter(n -> n.getName().equals(name))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

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
