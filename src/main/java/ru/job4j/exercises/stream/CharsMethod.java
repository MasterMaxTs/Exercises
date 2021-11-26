package ru.job4j.exercises.stream;

import java.util.List;
import java.util.stream.Collectors;

public class CharsMethod {

    /**
     * Метод возвращает список символов из строки
     * @param string строка на входе
     * @return возвращает список символов из строки
     */
    public static List<Character> chars(String string) {
        return string
                .chars()
                .mapToObj(intCh -> (char) intCh)
                .collect(Collectors.toList());
    }
}
