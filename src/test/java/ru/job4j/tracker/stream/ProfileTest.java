package ru.job4j.tracker.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class ProfileTest {
    private List<Profile> profiles = new ArrayList<>();

    @Before
    public void setUp() {
        Profile profile1 = new Profile();
        Address address1 = new Address("Russia", "Krasnaya", 154, 65);
        profile1.setAddress(address1);
        Profile profile2 = new Profile();
        Address address2 = new Address("Ukrane", "Komsomolskaya", 34, 5);
        profile2.setAddress(address2);
        profiles.add(profile1);
        profiles.add(profile2);
    }

    @Test
    public void whenGetAddressFromProfile() {
        Profile pr = new Profile();
        List<Address> rsl = pr.collect(profiles);
        assertThat(rsl.get(0).getCity(), is("Russia"));
        assertThat(rsl.get(1).getHome(), is(34));
    }
}