package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
        String[] answers = {"MyItemName"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expect = new Item("MyItemName");
        assertThat(created.getName(), is(expect.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Replace Item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "Replace Item"};
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("Replace Item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Delete Item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "Delete Item"};
        StartUI.deleteItem(new StubInput(answers), tracker);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

}