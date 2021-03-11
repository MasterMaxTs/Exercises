package ru.job4j.tracker.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cards {
    private Suit suit;
    private Value value;

    public Cards(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Cards() { }

    public List<Cards> generateCards() {
         return Stream.of(Suit.values())
                      .flatMap(suit -> Stream.of(Value.values())
                      .map(value -> new Cards(suit, value)))
                      .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Cards{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }

    public static void main(String[] args) {
        Cards cards = new Cards();
        cards.generateCards().forEach(System.out::println);
    }
}
