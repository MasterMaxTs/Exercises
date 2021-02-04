package ru.job4j.tracker.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SearchAttTest {

    @Test
    public void filterBySize() {
        List<Attachment> in = Arrays.asList(
                new Attachment("bug", 50),
                new Attachment("fail", 120),
                new Attachment("done", 105)
        );
        List<Attachment> expected = Arrays.asList( in.get(1), in.get(2));
        List<Attachment> rsl = SearchAtt.filterSize(in);
        assertThat(rsl, is(expected));
    }

    @Test
    public void filterByName() {
        List<Attachment> in = Arrays.asList(
                new Attachment("bug", 50),
                new Attachment("fail", 120),
                new Attachment("done", 105),
                new Attachment("bugFixed", 200)
        );
        List<Attachment> expected = Arrays.asList( in.get(0), in.get(3));
        List<Attachment> rsl = SearchAtt.filterName(in);
        assertThat(rsl, is(expected));
    }
}