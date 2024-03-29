package ru.job4j.stream.builder;

/**Суть:
 *  вынесения конструирования объекта за пределы его собственного класса
 *  (или за счет вложенного статического класса), поручив это дело отдельным объектам,
 *  которые и называются строителями.
 *
 * Когда стоит использовать шаблон проектирования Builder (Строитель):
 * 1. Когда мы хотим избавиться от конструктора с большим количеством параметров
 *    (случай описанный в задании);
 * 2. Когда код должен создавать разные представления какого-то объекта.
 *    Например, когда нам надо инициализировать лишь несколько полей из всего набора;
 * 3. Когда нам необходимо собирать сложные объекты, т.е. когда поля в классе
 *    являются экземплярами других классов.
 *
 * Преимущества использования шаблона Строитель:
 * 1. Позволяет создавать объекты пошагово;
 * 2. Позволяет использовать один и тот же код для создания различных объектов -
 *    если использовать не класс Builder, а interface с таким именем, тогда можно
 *    создавать различные имплементации этого интерфейса (в данном задании мы это не рассматривали);
 * 3. Сложный код сборки объекта от основной бизнес логики будет изолирован.
 *
 * Недостатки использования шаблона Строитель:
 * 1. Усложняет код программы из-за введения дополнительных классов.
 */

public class User {
    private String name;
    private String surname;
    private byte age;
    private String login;
    private String password;
    private boolean activated;
    private String gender;
/** Убираем конструктор с большим кол.-ом параметров */
//    public User(String name, String surname, byte age, String login, String password,
//                                            boolean activated, String gender) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.login = login;
//        this.password = password;
//        this.activated = activated;
//        this.gender = gender;

    /** Конструктор для построения объекта заменяем вложенным статическим классом */
    static class Builder {
        private String name;
        private String surname;
        private byte age;
        private String login;
        private String password;
        private boolean activated;
        private String gender;

    /**Методы строителя, инициализирующие поля объекта*/
        public Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildLogin(String login) {
            this.login = login;
            return this;
        }

        Builder buildPassword(String password) {
            this.password = password;
            return this;
        }

        Builder buildActivated(boolean activated) {
            this.activated = activated;
            return this;
        }

        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

    /** Финализиующий метод сборки объекта*/
        User build() {
            User user = new User();
            user.name = name;
            user.surname = surname;
            user.age = age;
            user.login = login;
            user.password = password;
            user.activated = activated;
            user.gender = gender;
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{"
                + "name='" + name
                + '\''
                + ", surname='" + surname
                + '\''
                + ", age=" + age
                + ", login='" + login
                + '\''
                + ", password='" + password
                + '\''
                + ", activated=" + activated
                + ", gender='" + gender
                + '\''
                + '}';
    }

    public static void main(String[] args) {
        User user = new Builder().buildName("Max")
                .buildSurname("Tsurkanov")
                .buildAge((byte) 35)
                .buildLogin("matsurka")
                .buildPassword("123")
                .buildActivated(true)
                .buildGender("male")
                .build();
        System.out.println(user);
    }
}
