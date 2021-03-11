package ru.job4j.tracker.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ComputeIfAbsent {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        Map<Integer, String> rsl = new HashMap<>(names);
        for (User user
                : users) {
            int id = user.getId();
            rsl.computeIfPresent(id, (k, v) -> v + users.get(k - 1).getName());
            rsl.computeIfAbsent(id, value -> users.get(id - 1).getName());
        }
        return rsl;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ComputeIfAbsent.User user = (ComputeIfAbsent.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
