package oop;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;


public class PointTest {

    @Test
    public void from02To45Is5() {
        Point a = new Point(0, 2);
        Point b = new Point(4, 5);
        double result = a.distance(b);
        assertThat(result, is(5.0));
    }

    @Test
    public void from00To09Is9() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 9);
        double result = a.distance(b);
        assertThat(result, is(9.0));
    }
}