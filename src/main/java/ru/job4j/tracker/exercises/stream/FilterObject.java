package ru.job4j.tracker.exercises.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс демонтсрирует фильтрацию пользователей
 */
public class FilterObject {
    public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    /**
     * Метод реализует фильтрацию пользователей по условиям:
     * - имя пользователя начинается на "B";
     * - возраст пользователя больше 18;
     * @param users список пользователей на входе
     * @return возвращает отфильтрованный список пользователей
     */
    public static List<User> filter(List<User> users) {
        return users
                .stream()
                .filter(us -> us.getName().startsWith("B"))
                .filter(us -> us.getAge() > 18)
                .collect(Collectors.toList());
    }
}
