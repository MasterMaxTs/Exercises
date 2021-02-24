package ru.job4j.tracker.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        Set<String> strings = new HashSet<>(Arrays.asList(s.split(" ")));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            if (words.contains(iterator.next())) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }

    public static void main(String[] args) {
        Set<String> words = Set.of("instagram", "фото", "мем", "котик");
        String s = "Криштиану Роналду опубликовал новую фотографию с детьми в instagram";
        System.out.println(checkName(s, words));
    }
}
