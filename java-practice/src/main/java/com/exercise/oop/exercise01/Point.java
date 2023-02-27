package com.exercise.oop.exercise01;

public class Point {
    private final double x;
    private final double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double distanceTo(final Point point) {
        final double dX = point.getX() - this.x;
        final double dY = point.getY() - this.y;
        return Math.sqrt(dX * dX + dY * dY);
    }
}
