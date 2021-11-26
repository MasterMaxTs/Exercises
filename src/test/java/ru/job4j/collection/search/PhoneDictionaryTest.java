package ru.job4j.collection.search;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class PhoneDictionaryTest {

    @Test
    public void whenAdd() {
        var person = new Person("Max", "Tsurkanov",
                "+786121", "Krasnodar");
        var phones = new PhoneDictionary();
        phones.add(person);
        String[] expected = {person.getName(),
                             person.getSurname(),
                             person.getPhone(),
                             person.getAddress(),
        };
        String[]rsl = {phones.getPersons().get(0).getName(),
                       phones.getPersons().get(0).getSurname(),
                       phones.getPersons().get(0).getPhone(),
                       phones.getPersons().get(0).getAddress(),
        };
        assertThat(rsl, is(expected));

    }

    @Test
    public void whenFindByNameIsSer() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Igor", "Ivanov", "6616161", "Moscow"));
        phones.add(new Person("Sergey", "Petrov", "2178364", "Kursk"));
        var foundPersonsList = phones.find("Ser");
        assertThat(foundPersonsList.get(0).getSurname(), is("Petrov"));
    }

    @Test
    public void whenFindByPhoneIs632() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Igor", "Ivanov", "6326161", "Moscow"));
        phones.add(new Person("Sergey", "Petrov", "63283264", "Kursk"));
        var foundPersonsList = phones.find("632");
        assertThat(foundPersonsList.get(0).getName(), is("Igor"));
        assertThat(foundPersonsList.get(1).getName(), is("Sergey"));
    }
}