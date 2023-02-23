package com.exercise.basic.numerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {
    @Test
    void findSumDigits() {
        final Exercise02 exercise02 = new Exercise02();
        assertEquals(10, exercise02.findSumDigitsOf(1234));
        assertEquals(1, exercise02.findSumDigitsOf(10));
        assertEquals(0, exercise02.findSumDigitsOf(0));
    }
}
