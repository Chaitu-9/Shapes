package com.twu.pathasala;

public class Triangle {
    Point firstPoint, secondPoint, thirdPoint;
    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint, Line line) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public double area() {
        if (firstPoint.coordinateX == secondPoint.coordinateX && secondPoint.coordinateX == thirdPoint.coordinateX
                || firstPoint.coordinateX == secondPoint.coordinateX && secondPoint.coordinateX == thirdPoint.coordinateX)
        return 0;
        else
            return Math.abs(firstPoint.coordinateX * (secondPoint.coordinateY - thirdPoint.coordinateY) +
                    secondPoint.coordinateX*(thirdPoint.coordinateY-firstPoint.coordinateY)+
                    thirdPoint.coordinateX*(firstPoint.coordinateY - secondPoint.coordinateY))/2;
    }
}
