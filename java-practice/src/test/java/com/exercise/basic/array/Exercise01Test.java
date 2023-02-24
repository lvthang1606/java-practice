package com.exercise.basic.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise01Test {
    @Test
    void findLargestNumber() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(10, exercise01.findLargestNumberIn(new int[] {1, 0, -1, 2, 3, 8, 10, 4}));
        assertEquals(50, exercise01.findLargestNumberIn(new int[] {10, 20, -15, 30, 50, 40}));
        assertEquals(-1, exercise01.findLargestNumberIn(new int[] {-10, -5, -4, -1}));
        assertEquals(0, exercise01.findLargestNumberIn(new int[] {0, -1, -2, -3, -4}));
        assertEquals(1, exercise01.findLargestNumberIn(new int[] { 1 }));
    }
}
