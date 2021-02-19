package ru.job4j.tracker.stream;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        Optional<Integer> rsl = stream
                                .filter(i -> i == 4)
                                .findFirst();
        if (rsl.isPresent()) {
            System.out.println("Найденное число в потоке: " + rsl.get());
        } else {
            System.out.println("Такого числа в потоке нет!");
        }
    }
}
