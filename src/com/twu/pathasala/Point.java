package com.twu.pathasala;

public class Point {
    int coordinateX, coordinateY;
    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distanceFrom(Point otherPoint) {
        if(coordinateY==0 && otherPoint.coordinateY ==0)
        return Math.abs(coordinateX - otherPoint.coordinateX);
        else if(coordinateX==0 && otherPoint.coordinateX ==0)
            return Math.abs(coordinateY - otherPoint.coordinateY);
        else if(coordinateY == otherPoint.coordinateY)
            return Math.abs(coordinateX - otherPoint.coordinateX);
        else
            return Math.abs(coordinateY - otherPoint.coordinateY);
    }
}
