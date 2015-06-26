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
        if((firstPoint.coordinateX == secondPoint.coordinateX && secondPoint.coordinateX ==thirdPoint.coordinateX && thirdPoint.coordinateX == fourthPoint.coordinateX)
                ||(firstPoint.coordinateY == secondPoint.coordinateY && secondPoint.coordinateY ==thirdPoint.coordinateY && thirdPoint.coordinateY == fourthPoint.coordinateY))
        return 0;
        else if(firstPoint.distanceFrom(secondPoint) == secondPoint.distanceFrom(thirdPoint)
                && secondPoint.distanceFrom(thirdPoint)== thirdPoint.distanceFrom(fourthPoint)
                && thirdPoint.distanceFrom(fourthPoint)== fourthPoint.distanceFrom(firstPoint))
            return Math.pow(firstPoint.distanceFrom(secondPoint),2);
        else
            return firstPoint.distanceFrom(secondPoint)*secondPoint.distanceFrom(thirdPoint);
    }
}
