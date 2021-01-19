package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SortedItemByNameTest {

    @Test
    public void whenSortedByIncreaseName() {
        List<Item> input = Arrays.asList(
                new Item("Item2"),
                new Item("Item1"),
                new Item("Item3")
        );
        SortedItemByName sortedItem = new SortedItemByName();
        List<Item> rsl = sortedItem.sortedByIncreaseName(input);
        Item[] expected = {
                new Item("Item1"),
                new Item("Item2"),
                new Item("Item3")
        };
        for (int i = 0; i < input.size(); i++) {
            assertThat(rsl.get(i).getName(), is(expected[i].getName()));
        }
    }

    @Test
    public void sortedByDecreaseName() {
        List<Item> input = Arrays.asList(
                new Item("Item2"),
                new Item("Item1"),
                new Item("Item3")
        );
        SortedItemByName sortedItem = new SortedItemByName();
        List<Item> rsl = sortedItem.sortedByDecreaseName(input);
        Item[] expected = {
                new Item("Item3"),
                new Item("Item2"),
                new Item("Item1")
        };
        for (int i = 0; i < input.size(); i++) {
            assertThat(rsl.get(i).getName(), is(expected[i].getName()));
        }
    }
}