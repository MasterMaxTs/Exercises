package ru.job4j.tracker.exercises.stream;

import java.util.List;
import java.util.stream.Collectors;

public class OptionalStream {
    public static class PhoneNumber {
        private String phone;

        public PhoneNumber(String phone) {
            this.phone = phone;
        }

        public String getPhone() {
            return phone;
        }
    }

    public static class User {
        private List<PhoneNumber> numbers;
        private int id;

        public User(int id, List<PhoneNumber> numbers) {
            this.id = id;
            this.numbers = numbers;
        }

        public List<PhoneNumber> getNumbers() {
            return numbers;
        }

        public int getId() {
            return id;
        }
    }

    /**
     * Метод находит тел. номера пользователя с заданным id,
     * которые начинаются с region
     * @param users список пользователей на входе
     * @param id идентификатор пользователя
     * @param region префикс телефонного номера
     * @return возвращает список номеров у пользователя с заданным id,
     * удовлетворящих префиксу
     */
    public static List<PhoneNumber> collectNumber(List<User> users,
                                                  int id,
                                                  String region) {
        return users.stream()
                .filter(us -> us.getId() == id)
                .findFirst()
                .stream()
                .flatMap(u -> u.getNumbers().stream())
                .filter(n -> n.getPhone().startsWith(region))
                .collect(Collectors.toList());
    }
}
