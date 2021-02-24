package ru.job4j.tracker.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        String[] letters = s.split("");
        Set<String> check = new HashSet<>(Arrays.asList(letters));
        return letters.length == check.size();
    }

    public static void main(String[] args) {
        String s = "uncopyrightables";
        System.out.println("Is string \'" + s +"\' does isogram?\n" + checkString(s));
        s = "javascript";
        System.out.println("Is string \'" + s +"\' does isogram?\n" + checkString(s));
    }
}
