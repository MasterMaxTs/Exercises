package ru.job4j.collection.search;

import ru.job4j.collection.Account;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account value
                : accounts) {
            rsl.add(value);
        }
        return rsl;
    }

    /*public static HashSet<Account> sent(List<Account> accounts) {
        return new HashSet<>(accounts);
    }    */
}
