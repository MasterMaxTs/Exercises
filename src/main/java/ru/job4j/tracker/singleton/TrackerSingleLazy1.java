package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;

import java.util.Arrays;

public class TrackerSingleLazy1 {
    public static TrackerSingleLazy1 instance;
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private TrackerSingleLazy1() {

    }

    public static TrackerSingleLazy1 getInstance() {
        if (instance == null) {
            instance = new TrackerSingleLazy1();
        }
        return instance;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);

    }

    public Item[] findByName(String key) {
        int size = 0;
        Item[] copyItem = new Item[this.size];
        for (int i = 0; i < this.size; i++) {
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

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;
            return true;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(TrackerSingleLazy1.getInstance());
        System.out.println(TrackerSingleLazy1.getInstance());
        System.out.println(TrackerSingleLazy1.getInstance());
    }

}
