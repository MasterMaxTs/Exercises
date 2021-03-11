package ru.job4j.tracker.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {
    private final String a = "10A";
    private final String b = "10B";
    private final String c = "10C";

    public List<Student> getSchoolClass(List<Student> students,
                                        String className) {
        Map<String, List<Student>> map = new HashMap<>();
        map.put(a, sortedClass(students, s -> s.getScore() >= 70));
        map.put(b, sortedClass(students, s -> s.getScore() >= 50
                                && s.getScore() < 70));
        map.put(c, sortedClass(students, s -> s.getScore() < 50));
        if (!className.equalsIgnoreCase(a)
                && (!className.equalsIgnoreCase(b)
                    && (!className.equalsIgnoreCase(c)))) {
                        throw new IllegalArgumentException("Incorrect class name!");
        }

        return map.get(className);
    }

    public List<Student> sortedClass(List<Student> students,
                                     Predicate<Student> predicate) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .sorted(Comparator.comparing(Student::getScore))
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        School sc = new School();
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "Surname1"));
        students.add(new Student(20, "Surname2"));
        students.add(new Student(30, "Surname3"));
        students.add(new Student(40, "Surname4"));
        students.add(new Student(50, "Surname5"));
        students.add(new Student(60, "Surname6"));
        students.add(new Student(70, "Surname7"));
        students.add(new Student(80, "Surname8"));
        students.add(new Student(90, "Surname9"));
        List<Student> students10A = sc.getSchoolClass(students, "10A");
        System.out.println("========= " + sc.a + " ==========");
        students10A.forEach(System.out::println);
        List<Student> students10B = sc.getSchoolClass(students, "10B");
        System.out.println("========= " + sc.b + " ==========");
        students10B.forEach(System.out::println);
        List<Student> students10C = sc.getSchoolClass(students, "10C");
        System.out.println("========= " + sc.c + " ==========");
        students10C.forEach(System.out::println);
        List<Student> students10D = sc.getSchoolClass(students, "10D");
    }
}
