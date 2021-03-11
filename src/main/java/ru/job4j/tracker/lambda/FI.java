package ru.job4j.tracker.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public void showInfo(Attachment[] att) {
        for (Attachment val
                : att) {
            System.out.println(val);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("imageOne", 200),
                new Attachment("imageThree", 50),
                new Attachment("imageTwo", 100),
        };
       new FI().showInfo(attachments);
        /**
         * Сортировка массива по убыванию по полю size.
         * Компортатор определяется через анонимный класс
         */
        Arrays.sort(attachments, new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return o2.getSize() - o1.getSize();
            }
        });
        new FI().showInfo(attachments);
    }

}
