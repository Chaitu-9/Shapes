package com.twu.pathasala;

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

    @Test
    public void shouldCalculateAreaWhenPointsAreNonCollinear() {
        Point firstPoint = new Point(5, 5);
        Point secondPoint = new Point(15, 5);
        Point thirdPoint = new Point(15, 10);
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);

        double actualArea = triangle.area();
        double expectedArea = 25;

        assertThat(actualArea, is(expectedArea));
    }

    @Test
    public void shouldDetermineIfTriangleIsEquilateral() {
        Point firstPoint = new Point(4, 0);
        Point secondPoint = new Point(-6, 0);
        Point thirdPoint = new Point(-1, 5 * Math.sqrt(3));
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);

        String equilateralCheckActual  = triangle.type();
        String equilateralCheckExpected = "Equilateral";

        assertThat(equilateralCheckActual, is(equilateralCheckExpected));
    }
}
