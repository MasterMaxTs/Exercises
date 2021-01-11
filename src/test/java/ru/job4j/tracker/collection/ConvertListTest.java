package ru.job4j.tracker.collection;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ConvertListTest {

    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1, 2});
        in.add(new int[] {3});
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expected));

    }
}