package ru.job4j.tracker.exercises.stream;

import java.util.*;
import java.util.stream.Collectors;

public class OptionalFilter {

    public static class Worker {
        private String passport;
        private List<Child> children;

        public Worker(String passport, List<Child> children) {
            this.passport = passport;
            this.children = children;
        }

        public String getPassport() {
            return passport;
        }

        public List<Child> getChildren() {
            return children;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Worker worker = (Worker) o;
            return Objects.equals(passport, worker.passport);
        }

        @Override
        public int hashCode() {
            return Objects.hash(passport);
        }
    }

    public static class Child {
        private String name;
        private int age;

        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    /**
     * Метод осуществляет поиск работника по паспорту
     * @param workers список рабочих на входе
     * @param passport номер паспорта на входе
     * @return возвращает искомого работника по паспорту
     */
    public static Optional<Worker> findByPassport(List<Worker> workers,
                                                  String passport) {
        return workers
                .stream()
                .filter(w -> w.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод находит список детей работника, которым положены льготы
     * @param workers список рабочих на входе
     * @param password номер паспорта на входе
     * @return возвращает список детей работника, которым положены льготы:
     * кол.-во детей > 2, возраст детей < 15
     */
    public static List<Child> defineChildren(List<Worker> workers,
                                          String password) {
        Optional<Worker> worker = findByPassport(workers, password);
        if (worker.isPresent()) {
            return worker
                        .filter(w -> w.getChildren().size() > 2)
                        .map(Worker::getChildren)
                        .stream()
                        .flatMap(Collection::stream)
                        .filter(ch -> ch.getAge() < 15)
                        .collect(Collectors.toList());
        }
        return List.of();
    }
}
