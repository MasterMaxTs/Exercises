package ru.job4j.tracker.exercises.stream;

import java.util.*;
import java.util.stream.Collectors;

public class SummingMethod {

    /**
     * Класс описывает модель счета пользователя
     */
    public static class Bill {
        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    /**
     * Класс описывает модель пользователя
     */
    public static class User {
        private String name;
        private List<Bill> bills;

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    /**
     * Вспомогательный класс для группировки
     */
    public static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    /**
     * Метод группирует входные данные в карту
     * @param users лист пользователей на входе
     * @return возращает сгруппированные данные в виде карты
     * [имя пользователя = суммарный баланс на всех счетах у пользователя]
     */
    public static Map<String, Integer> summing(List<User> users) {
        return users.stream()
                .flatMap(
                        u -> u.getBills().stream()
                                         .map(b -> new Pair(u, b))
                )
                .collect(
                        Collectors.groupingBy(
                                p -> p.getUser().getName(),
                                Collectors.summingInt(p -> p.getBill().getBalance())
                        )
                );
    }
}
