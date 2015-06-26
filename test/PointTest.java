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
}
