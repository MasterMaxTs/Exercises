package ru.job4j.tracker.collection;

import java.util.*;

public class JobSorter {
    public static void showSortedJobs(List<Job> jobs) {
        System.out.println();
        for (Job job : jobs) {
            System.out.println(job);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Doctor", 2),
                new Job("Java Developer", 4),
                new Job("Engineer", 1),
                new Job("Teacher", 0),
                new Job("Doctor", 3),
                new Job("Engineer", 4)
        );
        showSortedJobs(jobs);
        System.out.println("================SortedByName_PriorityByIncrease==============");
        Comparator<Job> cmp = new JobDescByNameInc().thenComparing(new JobDescByPriorityInc());
        jobs.sort(cmp);
        showSortedJobs(jobs);
        System.out.println("================SortedByName_PriorityByDecrease==============");
        cmp = new JobDescByNameDec().thenComparing(new JobDescByPriorityDec());
        jobs.sort(cmp);
        showSortedJobs(jobs);
        System.out.println("================SortedByPriority_NameByIncrease==============");
        cmp = new JobDescByPriorityInc().thenComparing(new JobDescByNameInc());
        jobs.sort(cmp);
        showSortedJobs(jobs);
        System.out.println("================SortedByPriority_NameByDecrease==============");
        cmp = new JobDescByPriorityDec().thenComparing(new JobDescByNameDec());
        jobs.sort(cmp);
        showSortedJobs(jobs);
    }
}