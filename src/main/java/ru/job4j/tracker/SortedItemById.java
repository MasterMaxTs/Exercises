package ru.job4j.tracker;

import java.util.Comparator;
import java.util.List;

public class SortedItemById implements Comparator<Item> {
    private int id;

    @Override
    public int compare(Item o1, Item o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
