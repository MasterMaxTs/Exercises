package ru.job4j.exercises;

import java.util.function.Consumer;

public class MethodReference {
    /**
     * Метод обращается к нестатическому методу (методу объекта)
     */
    public void applyByInstance() {
        Consumer<String> consumer = this::consumerByInstance;
        consumer.accept("Hello");
    }

    /**
     * Метод обращается к статическому методу (методу класса)
     */
    public static void applyByClass() {
        Consumer<String> consumer = MethodReference::consumerByClass;
        consumer.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }
}
