package com.twu.pathasala;

public class Triangle {
    Point firstPoint, secondPoint, thirdPoint;
    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public double area() {
        return Math.abs(firstPoint.coordinateX * (secondPoint.coordinateY - thirdPoint.coordinateY) +
                    secondPoint.coordinateX*(thirdPoint.coordinateY-firstPoint.coordinateY)+
                    thirdPoint.coordinateX*(firstPoint.coordinateY - secondPoint.coordinateY))/2;
    }

    public String type() {
        if(firstPoint.distanceFrom(secondPoint) == firstPoint.distanceFrom(thirdPoint)
                &&firstPoint.distanceFrom(thirdPoint) == secondPoint.distanceFrom(thirdPoint) )
        return "Equilateral";
        else if(firstPoint.distanceFrom(secondPoint) == firstPoint.distanceFrom(thirdPoint))
            return "Isosceles";
        else if(firstPoint.distanceFrom(secondPoint) == secondPoint.distanceFrom(thirdPoint))
            return "Isosceles";
        else if(firstPoint.distanceFrom(thirdPoint) == secondPoint.distanceFrom(thirdPoint))
            return "Isosceles";
        else
            return null;
    }
}
