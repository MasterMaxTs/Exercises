package ru.job4j.tracker.exercises;

import java.util.*;

public class MostUsedCharacterV2 {
    public static char getMaxCount(String str) {
        char rsl = ' ';
        String strLowerCase = str.toLowerCase();
        String[] strArr = strLowerCase.split(" ");
        StringBuilder resultStr = new StringBuilder();
        for (String value :
                strArr) {
            resultStr.append(value);
        }
        char[] charArr = resultStr.toString().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch :
                charArr) {
            map.computeIfAbsent(ch, value -> 1);
            map.computeIfPresent(ch, (k, v) -> v + 1);
        }
        Map<Integer, Character> sortedMap = new TreeMap<>();
        for (Map.Entry entry : map.entrySet()) {
            sortedMap.put((Integer) entry.getValue(), (Character)entry.getKey());
        }
        return sortedMap.get(Collections.max(sortedMap.keySet()));
    }

    public static void main(String[] args) {
        String str = "Мой дядя самых честных правил "
                + "Когда не в шутку занемог "
                + "Он уважать себя заставил "
                + "И лучше выдумать не мог "
                + "Его пример другим наука "
                + "Но боже мой какая скука "
                + "С больным сидеть и день и ночь "
                + "Не отходя ни шагу прочь "
                + "Какое низкое коварство "
                + "Полуживого забавлять "
                + "Ему подушки поправлять "
                + "Печально подносить лекарство "
                + "Вздыхать и думать про себя "
                + "Когда же черт возьмет тебя";
        System.out.println("Часто используемый символ = " + "\""
                                                          +getMaxCount(str) + "\"");
    }
}
