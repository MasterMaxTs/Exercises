package ru.job4j.tracker.exercises;

import java.util.List;
import java.util.Optional;

public class OptionalOrElseThrow {
    public static class User {
        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException {
        /**
         * Метод возвращает результат поиска пользователя по логину
         * @param list на входе лист пользователей
         * @param login на входе искомый логин пользователя
         * @return возращает пользователя либо кидает исключение
         * UserNotFoundException, если пользователь не найден
         * по запрошенному логину
         */
        public static User orElseThrow (List<User> list, String login) {
            return search(list, login).orElseThrow(UserNotFoundException::new);
        }

        /**
         * Метод выполняет поиск пользователя по Login
         * @param list на вход поступает лист пользователей
         * @param login на вход подается искомый логин пользователя
         * @return возвращает искомого пользователя в Optional
         */
        private static Optional<User> search(List<User> list, String login) {
            Optional<User> user = Optional.empty();
            for (User u :
                    list) {
                if (u.getLogin().equals(login)) {
                    return Optional.of(u);
                }
            }
            return user;
        }
    }
}
