package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class ProfilesTest {
    private List<Profile> profiles = new ArrayList<>();

    @Before
    public void setUp() {
        Profile profile1 = new Profile();
        Address address1 = new Address("Russia", "Krasnaya", 154, 65);
        profile1.setAddress(address1);
        Profile profile2 = new Profile();
        Address address2 = new Address("Ukraine", "Komsomolskaya", 34, 5);
        profile2.setAddress(address2);
        profiles.add(profile1);
        profiles.add(profile2);
        Profile profile3 = new Profile();
        Address address3 = new Address("Russia", "Krasnaya", 154, 65);
        profile3.setAddress(address3);
        Profile profile4 = new Profile();
        Address address4 = new Address("Kazakhstan", "Zhloby", 4, 90);
        profile4.setAddress(address4);
        profiles.add(profile3);
        profiles.add(profile4);
    }

    @Test
    public void whenGetAddressFromProfile() {
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(profiles);
        assertThat(rsl.get(0).getCity(), is("Russia"));
        assertThat(rsl.get(1).getHome(), is(34));
    }

    @Test
    public void whenGetAddressWithoutDuplicateAndSorted() {
        Profiles pr = new Profiles();
        List<Address> rsl = pr.newCollect(profiles);
        assertThat(rsl.size(), is(3));
        assertThat(rsl.get(0).getCity(), is("Kazakhstan"));
    }
}