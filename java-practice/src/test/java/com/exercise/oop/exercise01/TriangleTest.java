package com.exercise.oop.exercise01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    final Point pointA = new Point(4, 5);
    final Point pointB = new Point(2, 2);
    final Point pointC = new Point(8, 2);
    final Triangle triangle = new Triangle(pointA, pointB, pointC);
    @Test
    void halfSideDelta() {
        assertEquals(18, triangle.halfSideDelta(new Point(4, 5), new Point(2, 2), new Point(8, 2)));
        assertEquals(8, triangle.halfSideDelta(new Point(4, 5), new Point(4, 3), new Point(8, 2)));
        assertEquals(14, triangle.halfSideDelta(new Point(2, 7), new Point(4, 3), new Point(8, 2)));
    }

    @Test
    void getArea() {
        assertEquals(9, triangle.getArea(), 0.1);
    }

    @Test
    void getPerimeter() {
        assertEquals(14.6, triangle.getPerimeter(), 0.1);
    }

    @Test
    void contains() {
        assertTrue(triangle.contains(new Point(4, 3)));
        assertTrue(triangle.contains(new Point(4, -3)));
        assertFalse(triangle.contains(new Point(2, 7)));
        assertFalse(triangle.contains(new Point(-2, 7)));
        assertTrue(triangle.contains(new Point(-2, -5)));
        assertFalse(triangle.contains(new Point(-10, 2)));
    }
}
