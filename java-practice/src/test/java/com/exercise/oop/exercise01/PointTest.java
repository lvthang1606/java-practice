package com.exercise.oop.exercise01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    final Point a = new Point(2, 7);
    final Point b = new Point(3, 4);
    final Point c = new Point(-3, 5);

    @Test
    void getX() {
        assertEquals(2, a.getX());
        assertEquals(3, b.getX());
        assertEquals(-3, c.getX());
    }

    @Test
    void getY() {
        assertEquals(7, a.getY());
        assertEquals(4, b.getY());
        assertEquals(5, c.getY());
    }

    @Test
    void distanceTo() {
        assertEquals(3.1, a.distanceTo(b), 0.1);
        assertEquals(6, b.distanceTo(c), 0.1);
        assertEquals(5.3, a.distanceTo(c), 0.1);
    }
}
