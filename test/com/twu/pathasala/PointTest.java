package com.twu.pathasala;

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

    @Test
    public void shouldCalculateDistanceBetweenTwoPointsWhenOnePointLiesOnXAxisAndOtherOnYAxis(){
        Point firstPoint = new Point(3,0);
        Point secondPoint = new Point(0,4);

        double actualDistance = firstPoint.distanceFrom(secondPoint);
        double expectedDistance =5;

        assertThat(actualDistance, is(expectedDistance));
    }

    @Test
    public void shouldCalculateDistanceBetweenTwoPointsWhenAllCoordinatesAreDifferent(){
        Point firstPoint = new Point(3,4);
        Point secondPoint = new Point(6,8);

        double actualDistance = firstPoint.distanceFrom(secondPoint);
        double expectedDistance =5;

        assertThat(actualDistance, is(expectedDistance));
    }

    @Test
    public void shouldCalculateSlopeOfLineParalleltoXAxis() {
        Point firstPoint = new Point(10, 0);
        Point secondPoint = new Point(4, 0);

        double actualSlope = firstPoint.slope(secondPoint);
        double expectedSlope = 0;

        assertThat(actualSlope, is(expectedSlope));
    }

    @Test
    public void shouldCalculateSlopeOfLineParalleltoYAxis() {
        Point firstPoint = new Point(5, 2);
        Point secondPoint = new Point(5, 0);

        double actualSlope = firstPoint.slope(secondPoint);
        double expectedSlope = Double.POSITIVE_INFINITY;

        assertThat(actualSlope, is(expectedSlope));
    }

    @Test
    public void shouldCalculateSlopeOfLineNotParalleltoAnyAxis() {
        Point firstPoint = new Point(3, 2);
        Point secondPoint = new Point(1, 0);

        double actualSlope = firstPoint.slope(secondPoint);
        double expectedSlope = 1;

        assertThat(actualSlope, is(expectedSlope));
    }

    @Test
    public void shouldDetermineIfPointsAreCollinearforThreePoints(){
        Point firstPoint = new Point(3, 1);
        Point secondPoint = new Point(6, 1);
        Point thirdPoint = new Point(8, 1);

        boolean isCollinearactual = firstPoint.arePointsNonCollinear(secondPoint, thirdPoint);
        boolean isCollinearexpected = false;

        assertThat(isCollinearactual, is(isCollinearexpected));
    }

    @Test
    public void shouldDetermineIfPointsAreCollinearforFourPoints(){
        Point firstPoint = new Point(3, 1);
        Point secondPoint = new Point(6, 1);
        Point thirdPoint = new Point(8, 1);
        Point fourthPoint = new Point(12, 1);

        boolean isCollinearactual = firstPoint.arePointsNonCollinear(secondPoint, thirdPoint, fourthPoint);
        boolean isCollinearexpected = false;

        assertThat(isCollinearactual, is(isCollinearexpected));
    }

    @Test
    public void shouldCheckIfAPointIsSameAsFirstPointInArguments(){
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(3, 4);
        Point thirdPoint = new Point(2, 6);
        Point fourthPoint = new Point(3, 5);

        boolean actualequity = firstPoint.compareTo(secondPoint, thirdPoint, fourthPoint);
        boolean expectedequity = true;

        assertThat(actualequity, is(expectedequity));
    }

    @Test
    public void shouldCheckIfAPointIsSameAsSecondPointInArguments(){
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(2, 6);
        Point thirdPoint = new Point(3, 4);
        Point fourthPoint = new Point(3, 5);

        boolean actualequity = firstPoint.compareTo(secondPoint, thirdPoint, fourthPoint);
        boolean expectedequity = true;

        assertThat(actualequity, is(expectedequity));
    }

    @Test
    public void shouldCheckIfAPointIsSameAsThirdPointInArguments(){
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(2, 6);
        Point thirdPoint = new Point(3, 5);
        Point fourthPoint = new Point(3, 4);

        boolean actualequity = firstPoint.compareTo(secondPoint, thirdPoint, fourthPoint);
        boolean expectedequity = true;

        assertThat(actualequity, is(expectedequity));
    }

    @Test
    public void shouldCheckIfAPointIsSameAsFirstPointInFourArguments(){
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(3, 4);
        Point thirdPoint = new Point(3, 5);
        Point fourthPoint = new Point(5, 2);
        Point fifthPoint = new Point(2, 6);


        boolean actualequity = firstPoint.compareTo(secondPoint, thirdPoint, fourthPoint, fifthPoint);
        boolean expectedequity = true;

        assertThat(actualequity, is(expectedequity));
    }

    @Test
    public void shouldCheckIfAPointIsSameAsAnyPointInArguments(){
        Point firstPoint = new Point(3, 4);
        Point secondPoint = new Point(2, 6);
        Point thirdPoint = new Point(3, 5);
        Point fourthPoint = new Point(6, 9);

        boolean actualequity = firstPoint.compareTo(secondPoint, thirdPoint, fourthPoint);
        boolean expectedequity = false;

        assertThat(actualequity, is(expectedequity));
    }

}
