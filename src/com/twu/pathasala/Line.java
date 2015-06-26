package com.twu.pathasala;

public class Line {
    Point firstPoint,secondPoint;

    public Line(Point firstPoint,Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint =secondPoint;
    }

    public double slope() {
        if(firstPoint.coordinateY == secondPoint.coordinateY)
        return 0;
        else if (firstPoint.coordinateX == secondPoint.coordinateX)
            return Double.POSITIVE_INFINITY;
        else
            return (firstPoint.coordinateY -secondPoint.coordinateY)/(firstPoint.coordinateX- secondPoint.coordinateX);
    }
}
