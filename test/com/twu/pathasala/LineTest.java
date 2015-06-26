package com.twu.pathasala;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LineTest {
    @Test
    public void shouldCalculateSlopeOfLineParalleltoXAxis() {
        Point firstPoint = new Point(1, 0);
        Point secondPoint = new Point(4, 0);
        Line line = new Line(firstPoint, secondPoint);

        double actualSlope = line.slope();
        double expectedSlope = 0;

        assertThat(actualSlope, is(expectedSlope));
    }

    @Test
    public void shouldCalculateSlopeOfLineParalleltoYAxis() {
        Point firstPoint = new Point(5, 2);
        Point secondPoint = new Point(5, 0);
        Line line = new Line(firstPoint, secondPoint);

        double actualSlope = line.slope();
        double expectedSlope = Double.POSITIVE_INFINITY;

        assertThat(actualSlope, is(expectedSlope));
    }
}
