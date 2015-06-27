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
        if(areAllSidesEqual())
            return "Equilateral";
        else if(areTwoSidesEqual())
            return "Isosceles";
        else
            return "Scalene";
    }

    private boolean areTwoSidesEqual() {
        return firstPoint.distanceFrom(secondPoint) == firstPoint.distanceFrom(thirdPoint)
                ||firstPoint.distanceFrom(secondPoint) == secondPoint.distanceFrom(thirdPoint)
                ||firstPoint.distanceFrom(thirdPoint) == secondPoint.distanceFrom(thirdPoint);
    }

    private boolean areAllSidesEqual() {
        return firstPoint.distanceFrom(secondPoint) == firstPoint.distanceFrom(thirdPoint)
                &&firstPoint.distanceFrom(thirdPoint) == secondPoint.distanceFrom(thirdPoint);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        return area() == triangle.area();
    }

    @Override
    public int hashCode() {
        int result = firstPoint.hashCode();
        result = 31 * result + secondPoint.hashCode();
        result = 31 * result + thirdPoint.hashCode();
        return result;
    }
}
