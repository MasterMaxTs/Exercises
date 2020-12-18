package ru.job4j.tracker;

public class FindItemByIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("The item with id = " + id + " was not found");
        }
        return true;
    }
}