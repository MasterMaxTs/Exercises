package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета пользователя в банке
 * @author MAXIM TSURKANOV
 * @version 1.0
 */
public class Account {
    /**
     * Поле, описывающие свойство реквизита счёта
     */
    private String requisite;
    /**
     * Поле, описывающие свойство денежного баланса на счёте
     */
    private double balance;

    /**
     * Инициализация полей модели банковского счета с помощью конструктора
     * @param requisite поле реквизита счета
     * @param balance поле денежного баланса на счёте
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Геттер
     * @return возвращает значение поля реквизита счёта
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Сеттер
     * @param requisite передает и инициализирует новым значением поле реквизит счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Геттр
     * @return возвращает значение поля денежный баланс на счете
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Сеттер
     * @param balance передает и инициализирует новым значением поле денежный баланс на счете
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод определяет уникальность клиента по полю реквизит счета
     * @param o ссылка на входящий объект
     * @return возвращает true, если банковский счет с переданными рекзизитами существует
     * и false в обратном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод возвращает уникальное значение хэш-кода банковского счета
     * @return возвращает значение хэш-кода клиентского банковского счета
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
