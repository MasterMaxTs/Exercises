package oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        /** delta - величина постоянного разряда
          при единоразовом подключении */
        int delta = this.load / 10;
        this.load -= delta;
        another.load += delta;
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(50);
        first.exchange(second);
        System.out.println(first.load);
        System.out.println(second.load);
        second.exchange(first);
        System.out.println(first.load);
        System.out.println(second.load);
    }
}
