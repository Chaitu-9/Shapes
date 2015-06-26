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
            if(areFourSidesEqual()
                    && (isPerpendicular(firstPoint, secondPoint, thirdPoint)
                    && isPerpendicular(thirdPoint, fourthPoint, firstPoint))
                    || (isPerpendicular(secondPoint, firstPoint, fourthPoint)
                    && isPerpendicular(secondPoint,thirdPoint,fourthPoint)))
                return "Square";
            else if(areFourSidesEqual())
                return "Rhombus";
            else
                return null;
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
}
