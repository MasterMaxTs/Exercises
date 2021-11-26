package ru.job4j.exercises.stream;

import java.util.Comparator;
import java.util.List;

public class MinMethod {
    /**
     * Метод позволяет вычислить минимальную длину строки во
     * входящем списке из строк
     * @param list на входе список строк
     * @return возвращает минимальную длину строки иначе выкидывает
     * NoSuchElementException (default), если входящий список пуст
     */
    public static String min(List<String> list) {
        return list.stream()
                    .min(Comparator.comparingInt(String::length))
                    .orElseThrow();
    }
}
