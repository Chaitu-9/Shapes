package com.twu.pathasala;

public class Point {
    double coordinateX, coordinateY;
    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distanceFrom(Point otherPoint) {
            return Math.sqrt(Math.pow(coordinateX - otherPoint.coordinateX, 2)+ Math.pow(coordinateY-otherPoint.coordinateY, 2));
    }

    public double slope(Point otherPoint) {
        if (coordinateX == otherPoint.coordinateX)
            return Double.POSITIVE_INFINITY;
        return (coordinateY -otherPoint.coordinateY)/(coordinateX- otherPoint.coordinateX);
    }

    public boolean arePointsNonCollinear(Point otherPoint, Point anotherPoint) {
        return slope(otherPoint) != otherPoint.slope(anotherPoint);
    }

    public boolean arePointsNonCollinear(Point otherPoint, Point anotherPoint, Point someOtherPoint) {
        return  slope(otherPoint) != otherPoint.slope(anotherPoint)
                && otherPoint.slope(anotherPoint) != anotherPoint.slope(someOtherPoint)
                && anotherPoint.slope(someOtherPoint) != someOtherPoint.slope(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Double.compare(point.coordinateX, coordinateX) != 0) return false;
        return Double.compare(point.coordinateY, coordinateY) == 0;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(coordinateX);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(coordinateY);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public Boolean compareTo(Point otherPoint, Point anotherPoint, Point someOtherPoint) {
        return (coordinateX == otherPoint.coordinateX && coordinateY == otherPoint.coordinateY)
                || (coordinateX == anotherPoint.coordinateX && coordinateY == anotherPoint.coordinateY)
                || (coordinateX == someOtherPoint.coordinateX && coordinateY == someOtherPoint.coordinateY);
    }

    public Boolean compareTo(Point otherPoint, Point anotherPoint, Point someOtherPoint, Point lastPoint) {
        return (coordinateX == otherPoint.coordinateX && coordinateY == otherPoint.coordinateY)
                || (coordinateX == anotherPoint.coordinateX && coordinateY == anotherPoint.coordinateY)
                || (coordinateX == someOtherPoint.coordinateX && coordinateY == someOtherPoint.coordinateY)
                || (coordinateX == lastPoint.coordinateX && coordinateY == lastPoint.coordinateY);
    }
}
