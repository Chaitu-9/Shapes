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
}
