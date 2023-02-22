package com.exercise.basic.numerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void findGreatestCommonDivisor() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(3, exercise01.findGreatestCommonDivisor(9, 12));
    }

    @Test
    void findLeastCommonMultiple() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals(0, exercise01.findLeastCommonMultiple(0, 0));
    }
}
