package ru.job4j.tracker.collection;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.is;

public class StringCompareTest {

    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare sc = new StringCompare();
        int rsl = sc.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rsl, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare sc = new StringCompare();
        int rsl = sc.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rsl, is(-1));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultWillBePositive() {
        StringCompare sc = new StringCompare();
        int rsl = sc.compare(
                "Ivanova",
                "Ivanov"
        );
        assertThat(rsl, is(1));
    }
}