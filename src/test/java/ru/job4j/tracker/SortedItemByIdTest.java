package ru.job4j.tracker;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SortedItemByIdTest {

    @Test
    public void sortedByDecreaseName() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Item1"));
        tracker.add(new Item("Item2"));
        tracker.add(new Item("Item3"));
        List<Item> input = tracker.findAll();
        input.sort(new SortedItemById().reversed());
        assertThat(input.get(0).getId(), is(3));
        assertThat(input.get(1).getId(), is(2));
        assertThat(input.get(2).getId(), is(1));
    }
}