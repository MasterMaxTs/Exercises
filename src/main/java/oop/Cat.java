package oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are nick cat and his food: ");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("Kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black Cat");
        black.eat("Fish");
        black.show();
    }
}
