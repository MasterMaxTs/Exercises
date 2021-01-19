package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SortedItemByNameTest {

    @Test
    public void whenSortedByIncreaseName() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Planning"));
        tracker.add(new Item("Discussing"));
        tracker.add(new Item("Coding"));
        List<Item> input = tracker.findAll();
        input.sort(new SortedItemByName());
        assertThat(input.get(0).getName(), is("Coding"));
        assertThat(input.get(1).getName(), is("Discussing"));
        assertThat(input.get(2).getName(), is("Planning"));
    }

    @Test
    public void sortedByDecreaseName() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("Planning"));
        tracker.add(new Item("Discussing"));
        tracker.add(new Item("Coding"));
        List<Item> input = tracker.findAll();
        input.sort(new SortedItemByName().reversed());
        assertThat(input.get(0).getName(), is("Planning"));
        assertThat(input.get(1).getName(), is("Discussing"));
        assertThat(input.get(2).getName(), is("Coding"));
    }
}