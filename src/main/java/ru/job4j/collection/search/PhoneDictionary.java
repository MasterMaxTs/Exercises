package ru.job4j.collection.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */

    public ArrayList<Person> find(String key) {
        var person = new ArrayList<Person>();
        for (var value : persons) {
            if (value.getName().contains(key) || value.getSurname().contains(key)
                    || value.getPhone().contains(key) || value.getAddress().contains(key)) {
                person.add(value);
            }
        }
        return person;
    }

}
