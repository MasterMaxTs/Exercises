package ru.job4j.tracker;

public class StartUI {
    public void init (Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            input = new ConsoleInput();
            int select = input.askInt("Select: ");
            if (select >= 0 && select < 7) {
                if (select == 0) {
                    System.out.println("=== Create a new Item ===");
                    String name = input.askString("Enter name: ");
                    Item item = new Item();
                    item.setName(name);
                    tracker.add(item);
                } else if (select == 1) {
                    System.out.println("=== Show all items ===");
                    Item[] items = tracker.findAll();
                    for (int i = 0; i < items.length; i++) {
                        System.out.println("Name " + items[i].getName() + " id - " + items[i].getId());
                    }
                } else if (select == 2) {
                    System.out.println("=== Replace a current Item ===");
                    int id = input.askInt("Enter id: ");
                    String name = input.askString("Enter name: ");
                    Item item = new Item();
                    item.setName(name);
                    if (tracker.replace(id, item)) {
                        System.out.println("Replace success!");
                    } else {
                        System.out.println("Error!");
                    }
                } else if (select == 3) {
                    System.out.println("=== Delete Item ===");
                    int id = input.askInt("Enter id: ");
                    if (tracker.delete(id)) {
                        System.out.println("Item # " + id + " has been deleted successfully!");
                    } else {
                        System.out.println("Error has been occurred!");
                    }
                } else if (select == 4) {
                    System.out.println("=== Find item by Id ===");
                    int id = input.askInt("Enter id: ");
                    if (tracker.findById(id) != null) {
                        Item item = tracker.findById(id);
                        System.out.println(item.toString());
                    } else {
                        System.out.println("The item with id = " + id + " was not found");
                    }

                } else if (select == 5) {
                    System.out.println("=== Find items by name ===");
                    String name = input.askString("Enter name item: ");
                    Item[] item = tracker.findByName(name);
                    if (item.length > 0) {
                        for (int i = 0; i < item.length; i++) {
                            System.out.println("Name " + item[i].getName() + "id " + item[i].getId());
                        }
                    } else {
                        System.out.println("Items with name \"" + name + "\" were not found");
                    }
                } else {
                    System.out.println("Exit programme success!");
                    run = false;
                }
            }
        }
    }

    private void showMenu() {
        System.out.println();
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
