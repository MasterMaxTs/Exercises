package ru.job4j.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Pangram {
    public static boolean checkString(String s) {
        Set<String> alphabet = new HashSet<>(Set.of("A", "B", "C", "D", "E", "F", "G", "H", "I",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "V", "X", "Y", "Z"));
        Set<String> stringChars = new HashSet<>(Arrays.asList(s.split("")));
        Set<String> chars = stringChars.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toCollection(HashSet::new));
        return chars.containsAll(alphabet);
    }

    public static void main(String[] args) {
        System.out.println(checkString("Jackdaws love my big sphinx of quartz"));
        System.out.println(checkString("It's amazing to learn Java lang!"));
        System.out.println(checkString("Mr. Jock, TV quiz Ph.D., bags few lynx."));
    }
}
