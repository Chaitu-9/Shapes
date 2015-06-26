package com.twu.pathasala.shapes;

import com.twu.pathasala.Point;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void shouldCalculateAreaWhenPointsAreCollinear() {
        Point firstPoint = new Point(1, 4);
        Point secondPoint = new Point(3, 4);
        Point thirdPoint = new Point(5, 4);
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);

        double actualArea = triangle.area();
        double expectedArea = 0;

        assertThat(actualArea, is(expectedArea));
    }
}
