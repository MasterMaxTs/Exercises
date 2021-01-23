package ru.job4j.tracker.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        char[] chLeft = left.toCharArray();
        char[] chRight = right.toCharArray();
        int count = Math.min(chLeft.length, chRight.length);
        for (int i = 0; i < count; i++) {
            if (chLeft[i] != chRight[i]) {
                return chLeft[i] - chRight[i];
            }
        }
        if (chLeft.length != chRight.length) {
            return chLeft.length > chRight.length ? 1 : -1;
        }
        return rsl;
    }
}
