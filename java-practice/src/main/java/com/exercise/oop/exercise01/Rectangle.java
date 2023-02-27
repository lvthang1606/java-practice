package com.exercise.oop.exercise01;

public class Rectangle implements Shape {
    private final Point topLeft;
    private final double width;
    private final double height;

    public Rectangle(final Point topLeft, final double width, final double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    @Override
    public boolean contains(final Point point) {
        return (topLeft.getX() + width >= point.getX() && point.getX() >= topLeft.getX())
                && (topLeft.getY() + height >= point.getY() && point.getY() >= topLeft.getY());
    }
}
