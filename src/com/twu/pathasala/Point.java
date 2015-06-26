package com.twu.pathasala;

public class Point {
    int coordinateX, coordinateY;
    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distanceFrom(Point otherPoint) {
            return Math.sqrt(Math.pow(coordinateX - otherPoint.coordinateX, 2)+ Math.pow(coordinateY-otherPoint.coordinateY, 2));
    }
}
