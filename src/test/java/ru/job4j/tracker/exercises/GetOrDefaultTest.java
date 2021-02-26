package ru.job4j.tracker.exercises;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class GetOrDefaultTest {

    @Test
    public void whenGetList() {
        List<String> one = List.of("one", "two", "three");
        List<String> two = List.of("four", "five", "six");
        GetOrDefault gd = new GetOrDefault();
        gd.addValue(1, one);
        gd.addValue(2, two);
        List<String> rsl = gd.getValue(2);
        assertThat(rsl, is(two));
    }

    @Test
    public void whenGetEmptyList() {
        List<String> one = List.of("one", "two", "three");
        List<String> two = List.of("four", "five", "six");
        GetOrDefault gd = new GetOrDefault();
        gd.addValue(1, one);
        gd.addValue(2, two);
        List<String> rsl = gd.getValue(3);
        assertThat(rsl, is(List.of()));
    }

    @Test
    public void whenAddListWithDuplicateKey() {
        List<String> list = List.of("one", "two", "three");
        List<String> second = List.of("four", "five", "six");
        List<String> third = List.of("seven", "eight", "nine");
        GetOrDefault gd = new GetOrDefault();
        gd.addValue(1, list);
        gd.addValue(2, second);
        gd.addValue(1, third);
        List<String> value = gd.getValue(1);
        assertThat(value, is(list));
    }
}