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

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index] = item;
            items[index].setId(id);
            return true;
        }
        return rsl;
    }
}