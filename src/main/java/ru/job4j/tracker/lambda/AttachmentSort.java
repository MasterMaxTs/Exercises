package ru.job4j.tracker.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image1", 100),
                new Attachment("image2", 13),
                new Attachment("image3", 34)

        );
        Comparator<Attachment> sortByAscSize = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };
        System.out.println(attachments);
        attachments.sort(sortByAscSize);
        System.out.println(attachments);
        Comparator<Attachment> sortByDescName = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return right.getName().compareTo(left.getName());
            }
        };
        attachments.sort(sortByDescName);
        System.out.println(attachments);
    }
}
