package ru.job4j.tracker.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FunInt {
    public static void showInfo(Attachment[] atts) {
        System.out.println();
        for (Attachment att :
                atts) {
            System.out.println(att);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 17)
        };
        Comparator<Attachment> compDescName = (left, right) -> {
            System.out.println("Compare - " + right.getName() + " : " + left.getName());
            return right.getName().compareTo(left.getName());
        };
        Arrays.sort(atts, compDescName);
        showInfo(atts);
        Comparator<Attachment> compDescSize = (left, right) -> {
            System.out.println("Compare -  " + right.getSize() + " : " + left.getSize());
            return right.getSize() - left.getSize();
        };
        Arrays.sort(atts, compDescSize);
        showInfo(atts);
    }
}
