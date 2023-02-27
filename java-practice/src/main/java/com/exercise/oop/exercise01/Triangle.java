package com.exercise.oop.exercise01;

public class Triangle implements Shape {

    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(final Point a, final Point b, final Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double halfSideDelta(final Point pointA, final Point pointB, final Point pointC) {
        return (pointA.getY() - pointB.getY()) * (pointC.getX() - pointA.getX()) + (pointB.getX() - pointA.getX()) * (pointC.getY() - pointA.getY());
    }

    @Override
    public double getArea() {
        // Half of the triangle's perimeter
        final double halfPerimeter = getPerimeter() / 2;
        // The lengths of the sides
        final double leftSide = a.distanceTo(b);
        final double rightSide = b.distanceTo(c);
        final double bottomSide = c.distanceTo(a);
        return Math.sqrt(halfPerimeter * (halfPerimeter - leftSide) * (halfPerimeter - rightSide) * (halfPerimeter - bottomSide));
    }

    @Override
    public double getPerimeter() {
        // The lengths of the sides
        final double leftSide = a.distanceTo(b);
        final double rightSide = b.distanceTo(c);
        final double bottomSide = c.distanceTo(a);

        return leftSide + rightSide + bottomSide;
    }

    @Override
    public boolean contains(final Point point) {
        if (halfSideDelta(a, b, point) * halfSideDelta(a, b, c) < 0) {
            return false;
        }

        if (halfSideDelta(a, c, point) * halfSideDelta(a, c, b) < 0) {
            return false;
        }

        return halfSideDelta(b, a, point) * halfSideDelta(b, a, c) >= 0;
    }
}
