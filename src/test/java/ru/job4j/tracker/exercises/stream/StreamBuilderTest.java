package ru.job4j.tracker.exercises.stream;

import org.junit.Test;
import ru.job4j.exercises.stream.StreamBuilder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StreamBuilderTest {

    @Test
    public void createStream() {
        Integer[] data = {1, 2, 3};
        List<Integer> expected = List.of(1, 3);
        Stream<Object> stream = StreamBuilder.createStream(data);
        List<Integer> rsl = stream
                                 .map(v -> (Integer) v)
                                 .collect(Collectors.toList());
        assertEquals(expected, rsl);
    }
}