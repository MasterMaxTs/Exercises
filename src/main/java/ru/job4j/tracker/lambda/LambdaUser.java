package ru.job4j.tracker.lambda;

public class LambdaUser {
    private String name;
    private int age;

    public LambdaUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
