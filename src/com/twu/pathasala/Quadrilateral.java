package com.twu.pathasala;

public class Quadrilateral {
    Point firstPoint, secondPoint, thirdPoint, fourthPoint;
    Line firstLine;

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


}
