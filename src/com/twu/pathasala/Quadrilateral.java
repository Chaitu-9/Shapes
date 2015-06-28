package com.twu.pathasala;

public class Quadrilateral {
    Point firstPoint, secondPoint, thirdPoint, fourthPoint;

    public Quadrilateral(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
        this.fourthPoint = fourthPoint;
    }

    public double area() {
            return Math.abs(firstPoint.coordinateX*secondPoint.coordinateY - secondPoint.coordinateX*firstPoint.coordinateY
                + secondPoint.coordinateX*thirdPoint.coordinateY - thirdPoint.coordinateX*secondPoint.coordinateY
                + thirdPoint.coordinateX*fourthPoint.coordinateY - fourthPoint.coordinateX*thirdPoint.coordinateY
                + fourthPoint.coordinateX*firstPoint.coordinateY - firstPoint.coordinateX*fourthPoint.coordinateY)/2;
    }


    public String type() {
        if(firstPoint.arePointsNonCollinear(secondPoint, thirdPoint, fourthPoint)) {
            if (areFourSidesEqual() && areAllSidesPerpendicular())
                return "Square";
            else if (areFourSidesEqual())
                return "Rhombus";
            else if (areOppositeSidesParallel() && areAllSidesPerpendicular())
                return "Rectangle";
            else if (areOppositeSidesParallel())
                return "Parallelogram";
            else
                return "Trapezium";
        }
             else
                return "Quadrilateral cannot be formed with these points";
    }


    private boolean areOppositeSidesParallel() {
        return isParallel(firstPoint, secondPoint, thirdPoint, fourthPoint)
                && isParallel(secondPoint, thirdPoint, fourthPoint, firstPoint);
    }

    private boolean areAllSidesPerpendicular() {
        return isPerpendicular(firstPoint, secondPoint, thirdPoint)
                && isPerpendicular(thirdPoint, fourthPoint, firstPoint)
                && isPerpendicular(secondPoint, firstPoint, fourthPoint)
                && isPerpendicular(secondPoint, thirdPoint, fourthPoint);
    }

    private boolean isParallel(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
        return firstPoint.slope(secondPoint)==thirdPoint.slope(fourthPoint);
    }

    private boolean isPerpendicular(Point firstPoint, Point secondPoint, Point thirdPoint) {
        if(firstPoint.slope(secondPoint) == Double.POSITIVE_INFINITY && secondPoint.slope(thirdPoint)==0)
            return true;
        else if(firstPoint.slope(secondPoint) == 0 && secondPoint.slope(thirdPoint)== Double.POSITIVE_INFINITY)
            return true;
        else
            return firstPoint.slope(secondPoint) * secondPoint.slope(thirdPoint) == -1;
    }

    private boolean areFourSidesEqual() {
        return firstPoint.distanceFrom(secondPoint) == secondPoint.distanceFrom(thirdPoint)
                && secondPoint.distanceFrom(thirdPoint) == thirdPoint.distanceFrom(fourthPoint)
                && thirdPoint.distanceFrom(fourthPoint) == fourthPoint.distanceFrom(firstPoint);
    }

    public boolean isOverlapping(Quadrilateral otherQuadrilateral) {
        if(firstPoint.compareTo(otherQuadrilateral.firstPoint, null, null) && secondPoint.compareTo(otherQuadrilateral.secondPoint, null, null) && thirdPoint.compareTo(otherQuadrilateral.thirdPoint, null, null) && fourthPoint.compareTo(otherQuadrilateral.fourthPoint, null, null))
        return true;
        else
            return false;
    }
}
