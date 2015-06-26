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
        Line otherLine = new Line(firstPoint, secondPoint);

        double actualSlope = line.slope(otherLine);
        double expectedSlope = 0;

        assertThat(actualSlope, is(expectedSlope));
    }
}
