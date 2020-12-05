package condition;

import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void from02To45Is5() {
        Point a = new Point(0, 2);
        Point b = new Point(4, 5);
        double result = a.distance(b);
        assertThat(result, closeTo(5, 0.01));
    }

    @Test
    public void from00To09Is9() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 9);
        double result = a.distance(b);
        assertThat(result, closeTo(9, 0.01));
    }

    @Test
    public void from024To579Is8_66() {
        Point a = new Point(0, 2, 4);
        Point b = new Point(5, 7, 9);
        double result = a.distance3d(b);
        assertThat(result, closeTo(8.66, 0.01));
    }

    @Test
    public void from004To300Is5() {
        Point a = new Point(0, 0, 4);
        Point b = new Point(3, 0, 0);
        double result = a.distance3d(b);
        assertThat(result, closeTo(5, 0.01));
    }
}