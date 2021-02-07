package ru.job4j.tracker.lambda;

import ru.job4j.tracker.collection.Job;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class JobSorterV2 {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Comparator<Job> compByName = Comparator.comparing(Job::getName);
        Comparator<Job> comByPriority = Comparator.comparingInt(Job::getPriority);
        Comparator<Job> combine = compByName.thenComparing(comByPriority);
        Consumer<Job> consumer = System.out::println;
        jobs.forEach(consumer);
        jobs.sort(combine);
        jobs.forEach(consumer);
    }
}
