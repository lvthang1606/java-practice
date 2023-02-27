package com.exercise.oop.exercise01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    final double radius = 5;
    final Point center = new Point(2,2);
    final Circle circle = new Circle(radius, center);

    @Test
    void getArea() {
        assertEquals(78.5, circle.getArea(), 0.1);
    }

    @Test
    void getPerimeter() {
        assertEquals(31.4, circle.getPerimeter(), 0.1);
    }

    @Test
    void contains() {
        assertFalse(circle.contains(new Point(0, 7)));
        assertTrue(circle.contains(new Point(2, 3)));
    }
}
