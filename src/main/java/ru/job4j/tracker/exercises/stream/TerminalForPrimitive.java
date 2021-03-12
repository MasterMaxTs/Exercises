package ru.job4j.tracker.exercises.stream;

import java.util.Arrays;

/**
 * Класс демонстрирует применение основных методов для
 * потоков из примитивных данных
 */
public class TerminalForPrimitive {
    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    public long count() {
        return Arrays.stream(this.data).count();
    }

    public long max() {
        return Arrays.stream(this.data).max().getAsInt();
    }

    public long min() {
        return Arrays.stream(this.data).min().getAsInt();
    }

    public long sum() {
        return Arrays.stream(this.data).sum();
    }

    public double avg() {
        return Arrays.stream(this.data).average().getAsDouble();
    }
}
