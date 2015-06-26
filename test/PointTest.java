import com.twu.pathasala.Point;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void shouldCalculateDistanceBetweenTwoPointsOnXAxis(){
        Point firstPoint = new Point(1,0);
        Point secondPoint = new Point(3,0);

        double actualDistance = firstPoint.distanceFrom(secondPoint);
        double expectedDistance =2;

        assertThat(actualDistance, is(expectedDistance));
    }

    @Test
    public void shouldCalculateDistanceBetweenTwoPointsOnYAxis(){
        Point firstPoint = new Point(0,1);
        Point secondPoint = new Point(0,3);

        double actualDistance = firstPoint.distanceFrom(secondPoint);
        double expectedDistance =2;

        assertThat(actualDistance, is(expectedDistance));
    }

    @Test
    public void shouldCalculateDistanceBetweenTwoPointsWhenYcoordinatesAreEqual(){
        Point firstPoint = new Point(2,1);
        Point secondPoint = new Point(5,1);

        double actualDistance = firstPoint.distanceFrom(secondPoint);
        double expectedDistance =3;

        assertThat(actualDistance, is(expectedDistance));
    }

}
