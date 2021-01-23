package ru.job4j.tracker.collection;

import java.util.HashMap;

public class PassportOffice {
    private HashMap<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            return true;
        }
        return rsl;
    }

    public Citizen getCitizen(String passport) {
        return citizens.get(passport);
    }
}
