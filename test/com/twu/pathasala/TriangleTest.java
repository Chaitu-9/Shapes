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

    @Test
    public void shouldDetermineIfTriangleIsIsoscelesIfFirstAndSecondSidesAreEqual() {
        Point firstPoint = new Point(2, 4);
        Point secondPoint = new Point(4, 0);
        Point thirdPoint = new Point(0, 0);
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);

        String isoscelesCheckActual  = triangle.type();
        String isoscelesCheckExpected = "Isosceles";

        assertThat(isoscelesCheckActual, is(isoscelesCheckExpected));
    }

    @Test
    public void shouldDetermineIfTriangleIsIsoscelesIfSecondAndthirdSidesAreEqual() {
        Point firstPoint = new Point(4, 0);
        Point secondPoint = new Point(2, 4);
        Point thirdPoint = new Point(0, 0);
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);

        String isoscelesCheckActual  = triangle.type();
        String isoscelesCheckExpected = "Isosceles";

        assertThat(isoscelesCheckActual, is(isoscelesCheckExpected));
    }

    @Test
    public void shouldDetermineIfTriangleIsIsoscelesIfFirstAndthirdSidesAreEqual() {
        Point firstPoint = new Point(4, 0);
        Point secondPoint = new Point(0, 0);
        Point thirdPoint = new Point(2, 4);
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);

        String isoscelesCheckActual  = triangle.type();
        String isoscelesCheckExpected = "Isosceles";

        assertThat(isoscelesCheckActual, is(isoscelesCheckExpected));
    }

    @Test
    public void shouldDetermineIfTriangleIsScalene() {
        Point firstPoint = new Point(4, 3);
        Point secondPoint = new Point(2, 0);
        Point thirdPoint = new Point(2, 4);
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);

        String scaleneCheckActual  = triangle.type();
        String scaleneCheckExpected = "Scalene";

        assertThat(scaleneCheckActual, is(scaleneCheckExpected));
    }

    @Test
    public void shouldDetermineIfTwoTrianglesAreEqualInArea() {
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 0);
        Point thirdPoint = new Point(0, 4);
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);


        Point otherfirstPoint = new Point(0, 0);
        Point othersecondPoint = new Point(2, 0);
        Point otherthirdPoint = new Point(2, 4);
        Triangle otherTriangle = new Triangle(otherfirstPoint, othersecondPoint, otherthirdPoint);

        Boolean checkActual  = triangle.equals(otherTriangle);
        Boolean checkExpected = true;

        assertThat(checkActual, is(checkExpected));
    }

    @Test
    public void shouldDetermineIfTwoTrianglesAreNotEqualInArea() {
        Point firstPoint = new Point(4, 3);
        Point secondPoint = new Point(2, 0);
        Point thirdPoint = new Point(2, 4);
        Triangle triangle = new Triangle(firstPoint, secondPoint, thirdPoint);


        Point otherfirstPoint = new Point(3, 4);
        Point othersecondPoint = new Point(5, 5);
        Point otherthirdPoint = new Point(9, 2);
        Triangle otherTriangle = new Triangle(otherfirstPoint, othersecondPoint, otherthirdPoint);

        Boolean checkActual  = triangle.equals(otherTriangle);
        Boolean checkExpected = false;

        assertThat(checkActual, is(checkExpected));
    }
}
