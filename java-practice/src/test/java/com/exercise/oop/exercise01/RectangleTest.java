package com.exercise.oop.exercise01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    final Point topLeft = new Point(2, 3);
    final double width = 4;
    final double height = 5;
    final Rectangle rectangle = new Rectangle(topLeft, width, height);

    @Test
    void getWidth() {
        assertEquals(4, rectangle.getWidth());
    }

    @Test
    void getHeight() {
        assertEquals(5, rectangle.getHeight());
    }

    @Test
    void getArea() {
        assertEquals(20, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(18, rectangle.getPerimeter());
    }

    @Test
    void contains() {
        assertTrue(rectangle.contains(new Point(3, 4)));
        assertFalse(rectangle.contains(new Point(0, 0)));
    }
}
