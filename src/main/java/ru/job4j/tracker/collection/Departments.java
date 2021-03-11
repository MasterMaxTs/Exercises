package ru.job4j.tracker.collection;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value
                : deps) {
            String start = "";
            for (String el
                    : value.split("/")) {
                start = start.equals("") ? el : start + "/" + el;
                tmp.add(start);
            }
        }
        return new ArrayList<>(tmp);
    }

    public static void depAscSorted(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void depDescSorted(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }

    public static void showDep(List<String> orgs) {
        for (String value
                : orgs) {
            System.out.println(value);
        }
        System.out.println("*****************************************************************");
    }

    public static void main(String[] args) {
        List<String> departments = Arrays.asList(
                "K1/SK1",

                "K1/SK2",

                "K1/SK1/SSK1",

                "K1/SK1/SSK2",

                "K2",

                "K2/SK1/SSK1",

                "K2/SK1/SSK2"
        );
        showDep(departments);
        List<String> treeDep = fillGaps(departments);
        showDep(treeDep);
        depAscSorted(treeDep);
        showDep(treeDep);
        depDescSorted(treeDep);
        showDep(treeDep);
    }
}
