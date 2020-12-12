package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        System.out.println(item.toString());
        Tracker tracker = new Tracker();
        tracker.add(item);
        System.out.println(tracker.findById(1).getId() + ", "
                + tracker.findById(1).getName());;
    }
}
