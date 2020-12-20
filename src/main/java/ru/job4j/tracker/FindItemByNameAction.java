package ru.job4j.tracker;

public class FindItemByNameAction implements UserAction{
    private final Output out;

    public FindItemByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "FindItemByName";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askString("Enter name item: ");
        Item[] item = tracker.findByName(name);
        if (item.length > 0) {
            for (int i = 0; i < item.length; i++) {
                out.println(item[i]);
            }
        } else {
            out.println("Items with name \"" + name + "\" were not found");
        }
        return true;
    }
}
