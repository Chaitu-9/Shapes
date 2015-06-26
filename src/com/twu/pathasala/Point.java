package com.twu.pathasala;

public class Point {
    int coordinateX, coordinateY;
    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distanceFrom(Point otherPoint) {
        return Math.abs(this.coordinateX - otherPoint.coordinateX);
    }
}
