package ru.job4j.tracker;

public class FindItemByNameAction implements UserAction{
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askString("Enter name item: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
                System.out.println(item[i]);
            }
        } else {
            System.out.println("Items with name \"" + name + "\" were not found");
        }
        return true;
    }
}
