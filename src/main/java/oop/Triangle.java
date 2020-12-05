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
        return (a + b + c) / 2;
    }

    public boolean exist(double a, double b, double c) {
        return ((a < b + c) && (b < a + c) && (c < a + b));
    }

    public double area() {
        double result = -1;
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ac = first.distance(third);
        double p = period(ab, bc, ac);
        if (exist(ab, ac, bc)) {
            return Math.sqrt(p*(p - ab) * (p - bc) * (p - ac));
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
