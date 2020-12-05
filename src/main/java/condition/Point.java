package condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public double distance(Point that) {
        return (Math.sqrt(Math.pow(this.x - that.x, 2)
                + Math.pow(this.y - that.y, 2)));
    }

    public double distance3d(Point that) {
        return Math.sqrt(distance(that) * distance(that) + Math.pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0 , 0);
        Point b = new Point(0, 2);
        System.out.println("2D distance between point A & point B is: "
                + a.distance(b));
        a = new Point(2, 3, 4);
        b = new Point(7, 8, 9);
        System.out.println("3D distance between point A & point B is: "
                + a.distance3d(b));
    }
}
