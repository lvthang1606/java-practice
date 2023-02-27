package com.exercise.oop.exercise01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    final Point topLeft = new Point(4, 5);
    final double sideLength = 3;
    final Square square = new Square(topLeft, sideLength);

    @Test
    void getWidth() {
        assertEquals(3, square.getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(3, square.getHeight());
    }

    @Test
    void getArea() {
        assertEquals(9, square.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(12, square.getPerimeter());
    }

    @Test
    void contains() {
        assertTrue(square.contains(new Point(6, 7)));
        assertFalse(square.contains(new Point(0, 0)));
    }
}
