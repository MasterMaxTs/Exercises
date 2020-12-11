package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        int size = 0;
        Item[] copyItem = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                copyItem[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(copyItem, size);

    }

    public Item[] findByName(String key) {
        int size = 0;
        Item[] copyItem = new Item[findAll().length];
        for (int i = 0; i < findAll().length; i++) {
            if(key.equals(items[i].getName())) {
                copyItem[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(copyItem, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}