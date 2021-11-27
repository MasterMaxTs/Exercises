package ru.job4j.tracker.exercises.stream;

import org.junit.Test;
import ru.job4j.exercises.stream.TerminalForPrimitive;

import static org.junit.Assert.assertEquals;

public class TerminalForPrimitiveTest {

    @Test
    public void test() {
        int[] data = {1, 3, 5, 7};
        TerminalForPrimitive terminal = new TerminalForPrimitive(data);
        assertEquals(4, terminal.count());
        assertEquals(7, terminal.max());
        assertEquals(1, terminal.min());
        assertEquals(16, terminal.sum());
        assertEquals(4, terminal.avg(), 0.01);
    }

    @Test
    public void whenPrintStatistics() {
        int[] data = {1, 3, 5, 7};
        TerminalForPrimitive terminal = new TerminalForPrimitive(data);
        String expect = "Count = 4, Max = 7, Min = 1, Sum = 16, Average = 4.0";
        String rsl = terminal.getStatistics();
        assertEquals(expect, rsl);
    }
}
