package ru.job4j.exercises.stream;

import java.util.List;

public class MapToIntMethod {

    /**
     * Метод подсчитывает сумму кодов символов
     * @param characters лист символов на входе
     * @return сумму кодов символов из входящего списка символов
     */
    public static long sum(List<Character> characters) {
        return characters.stream()
                .mapToInt(ch -> (int) ch)
                .sum();
    }
}
