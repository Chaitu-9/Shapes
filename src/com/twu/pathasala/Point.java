package com.twu.pathasala;

public class Point {
    int coordinateX, coordinateY;
    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distanceFrom(Point otherPoint) {
        if(coordinateY == otherPoint.coordinateY)
            return Math.abs(coordinateX - otherPoint.coordinateX);
        else if(coordinateX == otherPoint.coordinateX)
            return Math.abs(coordinateY - otherPoint.coordinateY);
        else if(coordinateY ==0 && otherPoint.coordinateX ==0)
            return Math.sqrt(Math.pow(coordinateX, 2)+ Math.pow(otherPoint.coordinateY, 2));
        else
            return Math.sqrt(Math.pow(coordinateX - otherPoint.coordinateX, 2)+ Math.pow(coordinateY-otherPoint.coordinateY, 2));
    }
}
