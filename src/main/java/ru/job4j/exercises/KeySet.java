package ru.job4j.exercises;

import java.util.HashMap;
import java.util.Map;

public class KeySet {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1, "root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (Integer value : map.keySet()) {
            System.out.println(value + " - " + map.get(value));
        }
    }
}
