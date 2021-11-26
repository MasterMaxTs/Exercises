package ru.job4j.exercises;

import java.util.function.Consumer;

public class ConsumerAndThen {
    /**
     * Метод печатает строку и переводит курсор на следующую строку
     * @param input строка, которая будет печататься в консоли
     * @return возращает объект типа совмещенный Consumer
     */
    public static Consumer<String> consumer(String input) {
        Consumer<String> print = s -> System.out.print(input);
        Consumer<String> ln = l -> System.out.println();
        return print.andThen(ln);
    }

    public static void main(String[] args) {
        consumer("Hello, world!").accept("Hello, world!");
        consumer("Java is great!").accept("Java is great!");
    }
}
