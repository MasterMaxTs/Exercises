package ru.job4j.tracker.exercises;

import java.util.function.Predicate;

public class MRPredicate {
    /**
     * Метод проверяет, что строка пустая
     * @return ссылку на метод isEmpty класса String
     */
    public static Predicate<String> predicate () {
        return String::isEmpty;
    }
}
