package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriorityByDecrease() {
        Comparator<Job> cmpNamePriorityDec = new JobDescByNameDec().thenComparing(
                new JobDescByPriorityDec());
        int rsl = cmpNamePriorityDec.compare(
                new Job("Impl task", 0),    /*I -> 73; F -> 70*/
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByEqualsNameAndPriorityByDecrease() {
        Comparator<Job> cmpNamePriorityDec = new JobDescByNameDec().thenComparing(
                new JobDescByPriorityDec());
        int rsl = cmpNamePriorityDec.compare(
                new Job("Fix bug", 1),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameIncrease() {
        Comparator<Job> cmpNameInc = new JobDescByNameInc();
        int rsl = cmpNameInc.compare(
                new Job("Other speciality", 2),
                new Job("Java Developer", 5)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByPriorityIncrease() {
        Comparator<Job> cmpPriorityInc = new JobDescByPriorityInc();
        int rsl = cmpPriorityInc.compare(
                new Job("Java Developer", 5),
                new Job("Other speciality", 2)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameDecrease() {
        Comparator<Job> cmpNameDec = new JobDescByNameDec();
        int rsl = cmpNameDec.compare(
                new Job("Other speciality", 2),
                new Job("Java Developer", 5)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityDecrease() {
        Comparator<Job> cmpPriorityDec = new JobDescByPriorityDec();
        int rsl = cmpPriorityDec.compare(
                new Job("Java Developer", 5),
                new Job("Other speciality", 2)
        );
        assertThat(rsl, lessThan(0));
    }
}