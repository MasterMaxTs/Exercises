package ru.job4j.tracker.exercises.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * Класс демонстрирует применение основных методов для
 * потоков из примитивных данных
 */
public class TerminalForPrimitive {
    private int[] data;

    public TerminalForPrimitive(int[] data) {
        this.data = data;
    }

    /**
     * Метод выводит в виде строки всю статистику из примитивного стрима
     * @return возращает строку статистики
     */
    public String getStatistics() {
        IntSummaryStatistics statistics = Arrays.stream(this.data).summaryStatistics();
        return "Count = " + statistics.getCount()
                + ", Max = " + statistics.getMax()
                + ", Min = " + statistics.getMin()
                + ", Sum = " + statistics.getSum()
                + ", Average = " + statistics.getAverage();
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
