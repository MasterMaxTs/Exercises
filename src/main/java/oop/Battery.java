package oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(70);
        Battery second = new Battery(30);
        first.exchange(second);
        System.out.println(first.load);
        System.out.println(second.load);
        second.exchange(first);
        System.out.println(first.load);
        System.out.println(second.load);
    }
}
