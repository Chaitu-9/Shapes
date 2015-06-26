package com.twu.pathasala;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class QuadrilateralTest {
    @Test
    public void shouldCalculateAreaWhenAllPointsAreCollinear(){
        Point firstPoint = new Point(1, 4);
        Point secondPoint = new Point(3, 4);
        Point thirdPoint = new Point(5, 4);
        Point fourthPoint = new Point(7, 4);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        double actualArea = quadrilateral.area();
        double expectedArea =0;

        assertThat(actualArea, is(expectedArea));
    }

    @Test
    public void shouldCalculateAreaIfQuadrilateralIsSquare(){
        Point firstPoint = new Point(0, 4);
        Point secondPoint = new Point(4, 4);
        Point thirdPoint = new Point(4, 0);
        Point fourthPoint = new Point(0, 0);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        double actualArea = quadrilateral.area();
        double expectedArea =16;

        assertThat(actualArea, is(expectedArea));
    }

    @Test
    public void shouldCalculateAreaIfQuadrilateralIsRectangle(){
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(4, 0);
        Point thirdPoint = new Point(4, 2);
        Point fourthPoint = new Point(0, 2);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        double actualArea = quadrilateral.area();
        double expectedArea =8;

        assertThat(actualArea, is(expectedArea));
    }

    @Test
    public void shouldCalculateAreaForAnyQuadrilateral(){
        Point firstPoint = new Point(-2, 2);
        Point secondPoint = new Point(-4, -2);
        Point thirdPoint = new Point(2, -2);
        Point fourthPoint = new Point(4, 2);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        double actualArea = quadrilateral.area();
        double expectedArea =24;

        assertThat(actualArea, is(expectedArea));
    }
}
