package ru.job4j.tracker;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedItemByName implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }

    public List<Item> sortedByIncreaseName(List<Item> items) {
        items.sort(new SortedItemByName());
        return items;
    }

    public List<Item> sortedByDecreaseName(List<Item> items) {
        items.sort(new SortedItemByName().reversed());
        return items;
    }




}
