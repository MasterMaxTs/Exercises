package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] chLeft = left.toCharArray();
        char[] chRight = right.toCharArray();
        int count = Math.min(chLeft.length, chRight.length);
        for (int i = 0; i < count; i++) {
            if (chLeft[i] != chRight[i]) {
                return chLeft[i] - chRight[i];
            }
        }
        return chLeft.length - chRight.length;
    }
}
