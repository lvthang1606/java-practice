package com.exercise.oop.exercise01;

public class Circle implements Shape {
    private final double radius;
    private final Point center;

    public Circle(final double radius, final Point center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean contains(final Point point) {
        return center.distanceTo(point) <= radius;
    }
}
