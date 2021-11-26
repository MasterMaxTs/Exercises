package ru.job4j.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Farm {
    public static int sumLegs(Map<Animal, Integer> data) {
        Map<Animal, Integer> map = new HashMap<>(data);
        int sum = 0;
        for (Animal animal
                : map.keySet()) {
            sum += animal.getLegs() * map.get(animal);
        }
        return sum;
    }

    public static class Animal {
        private String name;
        private int legs;

        public Animal(String name, int legs) {
            this.name = name;
            this.legs = legs;
        }

        public String getName() {
            return name;
        }

        public int getLegs() {
            return legs;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
