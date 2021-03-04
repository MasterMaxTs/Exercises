package ru.job4j.tracker.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MRSupplier {
    /**
     * Метод создает пустую строку с помощью функционального интерфейса Supplier
     * @return возвращает объект пустой строки
     */
    public static Supplier<String> supplier () {
        return String::new;
    }

    public static void main(String[] args) {
        System.out.println(supplier().get().isEmpty());
        /*Пример создания ArrayList() с помощью Supplier*/
        Supplier<List<Integer>> supplier = ArrayList::new;
        List<Integer> list = supplier.get();

    }

}
