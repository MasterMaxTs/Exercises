package ru.job4j.tracker.collection.bank;

import java.util.Objects;

/**
 * Класс описывает модель анкеты пользователя в банке
 * @author MAXIM TSURKANOV
 * @version 1.0
 */
public class User {
    private String passport;
    private String username;

    /**
     * Инициализация полей модели анкеты пользователя с помощью конструктора
     * @param passport поле номер паспорта клиента
     * @param username поле ФИО клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Геттер
     * @return возвращает значение поля паспорта клиента
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Сеттер
     * @param passport передает и инициализирует новым значением поле номер паспорта клиента
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Геттер
     * @return возвращает значение поля ФИО клиента
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сеттер
     * @param username передает и инициализирует новым значением поле ФИО клиента
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод определяет уникальность клиента по полю номер паспорта
     * @param o ссылка на входящий объект
     * @return возвращает true, если номер паспорта есть в DB банка
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод возвращает уникальное значение хэш-кода номера паспорта
     * @return возвращает значение хэш-кода номера паспорта клиента
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    /**
     * Метод позволяет вывести на экран представление анкеты пользователя в виде текстовой строки
     * @return возвращает строковое представление анкеты пользователя с выводом в консоль
     */
    @Override
    public String toString() {
        return "User{"
                +
                "passport='" + passport + '\''
                +
                ", username='" + username + '\''
                +
                '}';
    }
}
