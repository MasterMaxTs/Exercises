package ru.job4j.tracker.exercises.stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import ru.job4j.tracker.exercises.stream.OptionalFilter.Worker;
import ru.job4j.tracker.exercises.stream.OptionalFilter.Child;

import java.util.List;
import java.util.Optional;

public class OptionalFilterTest {

    @Test
    public void whenFindWorkerByPassport() {
        Child c1 = new Child("Sveta", 15);
        Worker w1 = new Worker("0030563897", List.of(c1));
        Worker w2 = new Worker("0100783677", List.of());
        assertEquals(
                "Sveta",
                OptionalFilter.findByPassport(List.of(w1, w2), "0030563897")
                        .get().getChildren().get(0).getName()
        );
    }

    @Test
    public void whenNotFindWorkerByPassport() {
        Child c1 = new Child("Sveta", 15);
        Worker w1 = new Worker("0030563897", List.of(c1));
        Worker w2 = new Worker("0100783677", List.of());
        assertEquals(
                Optional.empty(),
                OptionalFilter.findByPassport(List.of(w1, w2), "0080563897")
        );
    }

    @Test
    public void notExistAndNeedChild() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 18);
        Child c3 = new Child("c1", 11);
        Child c4 = new Child("c2", 15);
        Worker worker1 = new Worker("123", List.of(c1, c2));
        Worker worker2 = new Worker("456", List.of(c3, c4));
        assertEquals(List.of(), OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }

    @Test
    public void notExistAndChildrenOld() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 18);
        Child c3 = new Child("c1", 20);
        Child c4 = new Child("c2", 15);
        Worker worker1 = new Worker("123", List.of(c1, c2, c3));
        Worker worker2 = new Worker("456", List.of(c4));
        assertEquals(List.of(), OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }

    @Test
    public void whenExists() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 13);
        Child c3 = new Child("c1", 10);
        Child c4 = new Child("c2", 15);
        Worker worker1 = new Worker("123", List.of(c1, c2, c3));
        Worker worker2 = new Worker("456", List.of(c4));
        assertEquals(2, OptionalFilter.defineChildren(List.of(worker1, worker2), "123").size());
    }
}