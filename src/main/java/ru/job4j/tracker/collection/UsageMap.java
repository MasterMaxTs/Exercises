package ru.job4j.tracker.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("max_tsur@mail.ru", "Maxim Tsurkanov");
        map.put("other@gmail.com", "Ivan Petrov");
        for (String key
                : map.keySet()) {
            String value = map.get(key);
            System.out.println("Email: " + key + ", person is " + value);
        }
        System.out.println("*****************************************************");
        for (Map.Entry<String, String> entry
                : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Email: " + key + ", person is " + value);
        }
    }
}
