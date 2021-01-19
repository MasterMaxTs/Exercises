package ru.job4j.tracker.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JobSorted {
    public static void main(String[] args) {
        List<Job> jobList = Arrays.asList(
                new Job("Teacher", 2),
                new Job("Doctor", 1),
                new Job("Engineer", 3)
        );
        System.out.println(jobList);
        System.out.println("*****************************JobSortedByName*********************************************");
        jobList.sort(new JobDescByNameDec());
        System.out.println(jobList);
        System.out.println("*****************************JobSortedByPriority*****************************************");
        Collections.sort(jobList);
        System.out.println(jobList);
        System.out.println("*****************************JobSortedByReversePriority**********************************");
        jobList.sort(Comparator.reverseOrder());
        System.out.println(jobList);
    }
}
