package ru.job4j.tracker.collection.search;

import org.junit.Test;
import ru.job4j.tracker.collection.Account;

import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class NotifyAccountTest {

    @Test
    public void sentWhenDuplicateAccount() {
        List<Account> accounts = List.of(
                new Account("0001250254", "Ilya", "100000"),
                new Account("0025500365", "Victor", "50000"),
                new Account("0001250254", "Ilya", "25000")
        );
        HashSet<Account> expected = new HashSet<>(List.of(
                new Account("0001250254", "Ilya", "100000"),
                new Account("0025500365", "Victor", "50000"))
        );
        assertThat(NotifyAccount.sent(accounts), is(expected));
    }

    @Test
    public void whenDeleteAccount() {
        List<Account> accounts = List.of(
                new Account("0001250254", "Ilya", "100000"),
                new Account("0025500365", "Victor", "50000"),
                new Account("0001250254", "Ilya", "25000")
        );
        HashSet<Account> setAccounts = NotifyAccount.sent(accounts);
        boolean rsl =  setAccounts.add(
                new Account("0001250254", "Ilya", "25000")
        );
        assertThat(rsl, is(false));
    }
}