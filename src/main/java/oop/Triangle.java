package oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c){
        return a + b + c;
    }

    public boolean exist(double a, double b, double c) {
        boolean rsl = false;
        if((a < b + c) && (b < a + c) && (c < a + b)) {
            return true;
        }
        return rsl;
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ac = first.distance(third);
        double p05 = period(ab, bc, ac) / 2;
        if (exist(ab, ac, bc)) {
            return Math.sqrt(p05*(p05 - ab) * (p05 - bc) * (p05 - ac));
        }
        return result;
    }

    public static void main(String[] args) {
        Point ap = new Point(0, 2);
        Point bp = new Point(4, 5);
        Point cp = new Point(6, 3);
        Triangle abc = new Triangle(ap, bp, cp);
        System.out.println("Area is " + abc.area());
    }
}
