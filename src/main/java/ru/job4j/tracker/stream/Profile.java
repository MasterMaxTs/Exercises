package ru.job4j.tracker.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(p -> p.address).collect(Collectors.toList());
    }
}
