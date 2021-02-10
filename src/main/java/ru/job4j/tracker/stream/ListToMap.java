package ru.job4j.tracker.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public Map<String, Student> collectToMap(List<Student> students) {
        return students.stream().
                collect(Collectors.toMap(Student::getSurname, s -> s));
    }
}
