package ru.job4j.collection.bank;

import java.util.*;

/**
 *Класс описывает модель банковской системы.
 * В системе можно производить следующие действия:
 * 1. Регистрировать пользователя.
 * 2. Удалять пользователя из системы.
 * 3. Добавлять пользователю банковский счет. У пользователя системы могут быть несколько счетов.
 * 4. Переводить деньги с одного банковского счета на другой счет.
 * @author  MAXIM TSURKANOV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение данных осуществляется в коллекции типа HashMap
     */
    private HashMap<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет добавить нового пользователя в систему.
     * Если пользователь уже есть в системе, то добавление не производится.
     * @param user пользователь, которого будет добавляться в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод позволяет выполнить удаление пользователя из системы
     * @param user пользователь, который будет удален
     */
    public void removeUser(User user) {
        users.remove(user);
    }

    /**
     * Метод позволяет найти пользователя в системе по номеру паспорта
     * @param passport номер паспорта, по которому производится поиск пользователя
     * @return возвращает пользователя, у которого номер паспорта совпадает с запрошенным.
     * Если такого пользователя не нашлось, возвращается null.
     */
    public Optional<User> findByPassport(String passport) {
        Set<User> setUsers = users.keySet();
        return setUsers.stream()
                       .filter(u -> u.getPassport().equals(passport))
                       .findFirst();
    }

    /**
     * Метод позволяет добавить новый счет пользователю.
     * Если добавляемый счет уже есть в списке счетов пользователя, то добавление не производится.
     * @param passport номер паспорта, по которому производится поиск пользователя в системе
     * @param account номер счета, который будет добавлен к списку счетов пользователя.
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Метод позволяет выполнить поиск счета пользователя по запращиваемым реквизитам
     * @param passport номер паспорта, по которому производится поиск пользователя в системе
     * @param requisite запращиваемые реквизиты счета пользователя
     * @return возвращает счет пользователя, реквизиты которого совпадат с запращиваемыми и null
     * в противоположном случае
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> userAccounts = users.get(user.get());
            return userAccounts.stream()
                               .filter(a -> a.getRequisite().equals(requisite))
                               .findFirst();
        }
        return Optional.empty();
    }

    /**
     * Метод позволяет выполнить перечисление средств с одного счета на другой.
     * Транзакция будет выполнена, если пользователи с такими счетами найдены и на счету,
     * с которого оуществляется перечисление, достаточно денежных средств
     * @param srcPassport номер паспорта пользователя, который выполняет перевод средств
     * @param srcRequisite реквизиты счета, с которого быдет выполняться перечисление средств
     * @param destPassport номер паспорта пользователя, который будет получать переводимые средства
     * @param destRequisite реквизиты счета, на который будут зачисляться средства
     * @param amount количество переводимых средств в денежном эквиваленте
     * @return возвращае true, если транзакция прошла успено, и false в противоположном случае
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && srcAccount.get().getBalance() >= amount
                && destAccount.isPresent()) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            return true;
        }
        return rsl;
    }
}
