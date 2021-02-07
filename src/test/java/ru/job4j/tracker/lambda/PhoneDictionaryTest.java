package ru.job4j.tracker.lambda;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class PhoneDictionaryTest {

    @Test
    public void findBySurname() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person(
                "Maxim", "Tsurkanov", "555245", "Krasnodar")
        );
        ArrayList<Person> result = phones.find("Tsur");
        assertThat(result.get(0).getSurname(), is("Tsurkanov"));
    }

    @Test
    public void whenFindTheSameSurnameThenSortByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person(
                "Maxim", "Tsurkanov", "555245", "Krasnodar")
        );
        phones.add(new Person(
                "Nikolay", "Tsurkanov", "235245", "Pavlodar")
        );
        ArrayList<Person> result = phones.find("dar");
        assertThat(result.get(0).getAddress(), is("Krasnodar"));
        assertThat(result.get(1).getAddress(), is("Pavlodar"));
    }

    @Test
    public void findByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person(
                "Maxim", "Tsurkanov", "555245", "Krasnodar")
        );
        ArrayList<Person> result = phones.find("Max");
        assertThat(result.get(0).getName(), is("Maxim"));
    }

    @Test
    public void findByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person(
                "Maxim", "Tsurkanov", "555245", "Krasnodar")
        );
        ArrayList<Person> result = phones.find("5552");
        assertThat(result.get(0).getSurname(), is("Tsurkanov"));
    }
}



