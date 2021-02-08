package ru.job4j.tracker.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class School {
    public List<Student> collect(List<Student> students,
                                        Predicate<Student> predicate) {
         return  students.stream()
                 .filter(predicate)
                 .collect(Collectors.toList());
    }

    public Map<String, List<Student>> getSchoolClass(List<Student> students) {
        Map<String, List<Student>> map = new HashMap<>();
        map.put("10A", collect(students, s -> s.getScore() >= 70));
        map.put("10B", collect(students, s -> s.getScore() >= 50
                                && s.getScore() < 70));
        map.put("10C", collect(students, s -> s.getScore() < 50));
        return map;
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
        List<Student> students10A = sc.getSchoolClass(students).get("10A");
        System.out.println("========= 10A ==========");
        students10A.forEach(System.out::println);
        List<Student> students10B = sc.getSchoolClass(students).get("10B");
        System.out.println("========= 10B ==========");
        students10B.forEach(System.out::println);
        List<Student> students10C = sc.getSchoolClass(students).get("10C");
        System.out.println("========= 10C ==========");
        students10C.forEach(System.out::println);
    }
}
