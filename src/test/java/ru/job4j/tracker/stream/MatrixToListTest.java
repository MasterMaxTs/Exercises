package ru.job4j.tracker.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class MatrixToListTest {

    @Test
    public void listFromMatrix() {
        Integer[][] inputMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        MatrixToList mtl = new MatrixToList();
        List<Integer> rsl = mtl.listFromMatrix(inputMatrix);
        assertThat(rsl, is(Arrays.asList(1, 2, 3, 4, 5, 6 ,7 ,8 ,9)));

    }
}