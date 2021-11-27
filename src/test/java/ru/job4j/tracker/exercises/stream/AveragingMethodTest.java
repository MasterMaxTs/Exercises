package ru.job4j.tracker.exercises.stream;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import ru.job4j.exercises.stream.AveragingMethod;
import ru.job4j.exercises.stream.AveragingMethod.Company;
import ru.job4j.exercises.stream.AveragingMethod.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AveragingMethodTest {
    private List<Worker> workers = new ArrayList<>();

    @Before
    public void setUp() {
        Company c1 = new Company("Apple");
        Company c2 = new Company("Microsoft");
        Company c3 = new Company("Google");
        workers.add(new Worker(c1, 27));
        workers.add(new Worker(c2, 23));
        workers.add(new Worker(c3, 20));
        workers.add(new Worker(c1, 23));
        workers.add(new Worker(c2, 33));
        workers.add(new Worker(c3, 22));
        workers.add(new Worker(c1, 18));
        workers.add(new Worker(c2, 25));
        workers.add(new Worker(c1, 27));
    }

    @Test
    public void averaging() {
        Map<String, Double> expect = Map.of(
                "Apple", 23.75D,
                "Google", 21D,
                "Microsoft", 27D
        );
        assertEquals(expect, AveragingMethod.averaging(workers));
    }

    @Test
    public void counting() {
        Map<String, Long> expect = Map.of(
                "Apple", 4L,
                "Google", 2L,
                "Microsoft", 3L
        );
        assertEquals(expect, AveragingMethod.groupAndCount(workers));
    }
}