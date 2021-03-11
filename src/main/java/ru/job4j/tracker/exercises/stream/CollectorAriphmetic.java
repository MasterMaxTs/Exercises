package ru.job4j.tracker.exercises.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Класс рассчитывает редукцию списка int значений, как произведение
 * всех элементов, используя произвольный Collector.
 */
public class CollectorAriphmetic {
    /**
     * Метод вычисляет произведение всех элементов в листе,
     * используя stream и Collector
     * @param list на входе лист int чисел
     * @return возвращает int произведение всех элементов в листе
     */
    public static Integer collect(List<Integer> list) {
        /*Создаем хранилище*/
        Supplier<List<Integer>> supplier = LinkedList::new;
        /*Указываем, как добавлять в хранилище элементы*/
        BiConsumer<List<Integer>, Integer> biConsumer = List::add;      // (f, s) -> f.add(s);
        /*Совмещаем результаты параллельных вычислений*/
        BinaryOperator<List<Integer>> merger = (xs, ys) -> {
            xs.addAll(ys);
            return xs;
        };
        /*Задаем функцию, которая обработает каждое значение списка после сборки*/
        Function<List<Integer>, Integer> function = ns -> {
            int comp = 1;
            for (Integer i
                    : ns) {
                comp *= i;
            }
            return comp;
        };
        return list.stream()
                .collect(
                        Collector.of(supplier, biConsumer, merger, function)
                );
    }
}
