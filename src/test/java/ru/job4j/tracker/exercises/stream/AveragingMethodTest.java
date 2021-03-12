package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import ru.job4j.tracker.exercises.stream.AveragingMethod.Company;
import ru.job4j.tracker.exercises.stream.AveragingMethod.Worker;

import java.util.List;
import java.util.Map;

public class AveragingMethodTest {

    @Test
    public void averaging() {
        Company c1 = new Company("Apple");
        Company c2 = new Company("Microsoft");
        Company c3 = new Company("Google");
        Worker w1 = new Worker(c1, 27);
        Worker w2 = new Worker(c2, 23);
        Worker w3 = new Worker(c3, 20);
        Worker w4 = new Worker(c1, 23);
        Worker w5 = new Worker(c2, 31);
        Worker w6 = new Worker(c3, 22);
        List<Worker> workers = List.of(w1, w2, w3, w4, w5, w6);
        Map<String, Double> expect = Map.of(
                "Apple", 25D,
                "Google", 21D,
                "Microsoft", 27D
        );
        assertEquals(expect, AveragingMethod.averaging(workers));

    }
}