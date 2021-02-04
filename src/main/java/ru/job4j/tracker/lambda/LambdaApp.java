package ru.job4j.tracker.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class LambdaApp {
    public LambdaUser getInputUserInfo() {
        Supplier<LambdaUser> userFactory = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name user: ");
            String name = scanner.nextLine();
            System.out.println("Enter age user: ");
            int age = Integer.parseInt(scanner.nextLine());
            return new LambdaUser(name, age);
        };
        return userFactory.get();
    }

    public static void main(String[] args) {
        List<LambdaUser> users = Arrays.asList(
                new LambdaApp().getInputUserInfo(),
                new LambdaApp().getInputUserInfo(),
                new LambdaApp().getInputUserInfo()
        );
        for (LambdaUser user :
                users) {
            System.out.println(user);
        }
    }
}
