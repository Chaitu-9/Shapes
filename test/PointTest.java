import com.twu.pathasala.Point;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void shouldCalculateDistanceBetweenTwoPointsWhenBothXcoordinatesAndYcoordinatesAreEqual(){
        Point firstPoint = new Point(2,3);
        Point secondPoint = new Point(2,3);

        double actualDistance = firstPoint.distanceFrom(secondPoint);
        double expectedDistance =0;

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

    @Test
    public void shouldCalculateDistanceBetweenTwoPointsWhenXcoordinatesAreEqual(){
        Point firstPoint = new Point(2,2);
        Point secondPoint = new Point(2,5);

        double actualDistance = firstPoint.distanceFrom(secondPoint);
        double expectedDistance =3;

        assertThat(actualDistance, is(expectedDistance));
    }
}
