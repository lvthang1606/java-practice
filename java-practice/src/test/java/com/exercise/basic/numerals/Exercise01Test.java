package com.exercise.basic.numerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void findGreatestCommonDivisor() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(3, exercise01.findGreatestCommonDivisor(9, 12));
        assertEquals(2, exercise01.findGreatestCommonDivisor(6, 8));
        assertEquals(7, exercise01.findGreatestCommonDivisor(7, 14));
        assertEquals(1, exercise01.findGreatestCommonDivisor(3, 5));
    }

    @Test
    void findLeastCommonMultiple() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(0, exercise01.findLeastCommonMultiple(0, 0));
        assertEquals(12, exercise01.findLeastCommonMultiple(4, 6));
        assertEquals(10, exercise01.findLeastCommonMultiple(5, 10));
        assertEquals(7, exercise01.findLeastCommonMultiple(1, 7));
    }
}
