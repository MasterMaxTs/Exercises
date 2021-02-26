package ru.job4j.tracker.exercises;

import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        Map<Integer, String> rsl = new HashMap<>(name);
        for (Integer key :
                name.keySet()) {
            rsl.computeIfPresent(key, (k, value) ->
                                    value + " " + surname.getOrDefault(k, "'Surname is not present!'"));
        }
        return rsl;
    }

    public static void main(String[] args) {
        Map<Integer, String> name = new HashMap<>(Map.of(
                1, "Bill", 2, "Donald", 3, "Baraka"));
        Map<Integer, String> surname = new HashMap<>(Map.of(
                1, "Clinton", 2, "Trump"));
        name.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println("___________________________");
        surname.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println("___________________________");
        collectData(name, surname).forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
