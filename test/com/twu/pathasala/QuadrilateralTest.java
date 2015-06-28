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

    @Test
    public void shouldDetermineIfQuadrilateralIsSquare(){
        Point firstPoint = new Point(0, 4);
        Point secondPoint = new Point(4, 4);
        Point thirdPoint = new Point(4, 0);
        Point fourthPoint = new Point(0, 0);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        String actualShape = quadrilateral.type();
        String expectedShape = "Square";

        assertThat(actualShape, is(expectedShape));
    }

    @Test
    public void shouldDetermineIfQuadrilateralIsRhombus(){
        Point firstPoint = new Point(0, 4);
        Point secondPoint = new Point(2, 0);
        Point thirdPoint = new Point(4, 4);
        Point fourthPoint = new Point(2, 8);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        String actualShape = quadrilateral.type();
        String expectedShape = "Rhombus";

        assertThat(actualShape, is(expectedShape));
    }

    @Test
    public void shouldDetermineIfQuadrilateralIsRectangle(){
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(4, 0);
        Point thirdPoint = new Point(4, 2);
        Point fourthPoint = new Point(0, 2);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        String actualShape = quadrilateral.type();
        String expectedShape = "Rectangle";

        assertThat(actualShape, is(expectedShape));
    }

    @Test
    public void shouldDetermineIfQuadrilateralIsParallelogram(){
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(4, 0);
        Point thirdPoint = new Point(6, 4);
        Point fourthPoint = new Point(2, 4);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        String actualShape = quadrilateral.type();
        String expectedShape = "Parallelogram";

        assertThat(actualShape, is(expectedShape));
    }

    @Test
    public void shouldDetermineIfQuadrilateralIsTrapezium(){
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 3);
        Point thirdPoint = new Point(6, 1);
        Point fourthPoint = new Point(1, 4);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        String actualShape = quadrilateral.type();
        String expectedShape = "Trapezium";

        assertThat(actualShape, is(expectedShape));
    }

    @Test
    public void shouldDetermineIfQuadrilateralCannotBeFormedWithThosePoints(){
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 0);
        Point thirdPoint = new Point(6, 0);
        Point fourthPoint = new Point(1, 4);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        String actualShape = quadrilateral.type();
        String expectedShape = "Quadrilateral cannot be formed with these points";

        assertThat(actualShape, is(expectedShape));
    }

    @Test
    public void shouldDetermineIfTwoQuadrilateralsAreSameIfOrderOfPointsIsSame(){
        Point firstPoint = new Point(0, 0);
        Point secondPoint = new Point(2, 0);
        Point thirdPoint = new Point(6, 0);
        Point fourthPoint = new Point(1, 4);
        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);

        Point otherfirstPoint = new Point(0, 0);
        Point othersecondPoint = new Point(2, 0);
        Point otherthirdPoint = new Point(6, 0);
        Point otherfourthPoint = new Point(1, 4);
        Quadrilateral otherQuadrilateral = new  Quadrilateral(otherfirstPoint, othersecondPoint, otherthirdPoint, otherfourthPoint);

        boolean isSameactual = quadrilateral.isOverlapping(otherQuadrilateral);
        boolean isSameexpected = true;

        assertThat(isSameactual, is(isSameexpected));
    }

//    @Test
//    public void shouldDetermineIfTwoQuadrilateralsAreEqualInArea() {
//        Point firstPoint = new Point(4, 0);
//        Point secondPoint = new Point(0, 0);
//        Point thirdPoint = new Point(0, 4);
//        Point fourthPoint = new Point(4, 4);
//        Quadrilateral quadrilateral = new  Quadrilateral(firstPoint, secondPoint, thirdPoint, fourthPoint);
//
//
//        Point otherfirstPoint = new Point(0, 0);
//        Point othersecondPoint = new Point(8, 0);
//        Point otherthirdPoint = new Point(0, 2);
//        Point otherfourthPoint = new Point(8, 2);
//        Quadrilateral otherQuadrilateral = new  Quadrilateral(otherfirstPoint, othersecondPoint, otherthirdPoint, otherfourthPoint);
//
//        Boolean checkActual  = otherQuadrilateral.equals(quadrilateral);
//        Boolean checkExpected = true;
//
//        assertThat(checkActual, is(checkExpected));
//    }

}
