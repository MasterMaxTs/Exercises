package ru.job4j.tracker.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> findName = n -> n.getName().contains(key);
        Predicate<Person> findSurname = n -> n.getSurname().contains(key);
        Predicate<Person> findPhone = n -> n.getPhone().contains(key);
        Predicate<Person> findAddress = n -> n.getAddress().contains(key);
        Predicate<Person> combine = findName.or(findSurname).or(findPhone).or(findAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person :
                persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        Comparator<Person> compBySurname = Comparator.comparing(Person::getSurname);
        Comparator<Person> compByAddress = Comparator.comparing(Person::getAddress);
        Comparator<Person> compByPhone = Comparator.comparing(Person::getPhone);
        Comparator<Person> compCombine =
                compBySurname.thenComparing(compByAddress).thenComparing(compByPhone);
        result.sort(compCombine);
        return result;
    }
}
