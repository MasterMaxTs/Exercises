package ru.job4j.tracker.exercises.stream;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class AveragingMethod {
    public static class Company {
        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Company"
                    + " name='" + name
                    + '\'';
        }
    }

    public static class Worker {
        private Company company;
        private int age;

        public Worker(Company company, int age) {
            this.company = company;
            this.age = age;
        }

        public Company getCompany() {
            return company;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Worker{"
                    + company
                    + " - "
                    + age
                    + " age"
                    + '}';
        }
    }

    /**
     * Метод собирает отсортированную карту
     * @param workers список объектов на входе
     * @return возращает отсортированную Мар, где ключ - имя компании,
     * значение - средний возраст сотрудников компании
     */
    public static Map<String, Double> averaging(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        w -> w.getCompany().getName(),
                        TreeMap::new,
                        Collectors.averagingDouble(w -> w.getAge())
                        )
                );
    }

    /**
     *
     * @param workers список объектов на входе
     * @return возращает отсортированную Мар, где ключ - имя компании,
     * значение - количество сотрудников компании
     */
    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        w -> w.getCompany().getName(),
                        TreeMap::new,
                        Collectors.counting()
                        )
                );
    }

    public static void main(String[] args) {
        Company c1 = new Company("Google");
        Company c2 = new Company("Microsoft");
        Company c3 = new Company("Apple");
        Worker w1 = new Worker(c1, 27);
        Worker w2 = new Worker(c2, 23);
        Worker w3 = new Worker(c3, 19);
        Worker w4 = new Worker(c1, 23);
        Worker w5 = new Worker(c2, 18);
        Worker w6 = new Worker(c3, 21);
        Worker w7 = new Worker(c2, 28);
        Worker w8 = new Worker(c3, 20);
        Worker w9 = new Worker(c3, 22);
        List<Worker> workers = List.of(w1, w2, w3, w4, w5, w6, w7, w8, w9);
        workers.forEach(System.out::println);
        averaging(workers).forEach(
                (k, v) -> System.out.println(k + " : " + v + " average age")
        );
        groupAndCount(workers).forEach(
                (k, v) -> System.out.println(k + " : " + v + " count of workers")
        );
    }
}
