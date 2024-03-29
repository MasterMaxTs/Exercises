package ru.job4j.collection.college;

import java.util.Map;
import java.util.Set;

public class College {
    private final Map<Student, Set<Subject>> students;

    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    public Student findByAccount(String account) {
        for (Student s
                : students.keySet()) {
            if (account.equals(s.getAccount())) {
                return s;
            }
        }
        return null;
    }

    public Subject findBySubjectName(String account, String name) {
        Student s = findByAccount(account);
        if (s != null) {
            Set<Subject> subjects = students.get(s);
            for (Subject sbj
                    : subjects) {
                if (name.equals(sbj.getName())) {
                    return sbj;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "students: "
                + students + "\n";
    }
}
