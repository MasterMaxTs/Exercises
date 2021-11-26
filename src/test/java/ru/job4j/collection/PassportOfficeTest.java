package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PassportOfficeTest {

    @Test
    public void add() {
        Citizen citizen = new Citizen("2005 6589", "Nikolay");
        PassportOffice passportOffice = new PassportOffice();
        passportOffice.add(citizen);
        assertThat(passportOffice.getCitizen(citizen.getPassport()), is(citizen));
    }

}