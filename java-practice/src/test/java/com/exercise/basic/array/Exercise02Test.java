package com.exercise.basic.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercise02Test {
    @Test
    void evenNumbersMinusOddNumbers() {
        final Exercise02 exercise02 = new Exercise02();
        assertEquals(3, exercise02.evenNumbersMinusOddNumbers(new int[] { 1, 2, 3, 4, 5, 6 }));
        assertEquals(21, exercise02.evenNumbersMinusOddNumbers(new int[] { -1, 2, -3, 4, -5, 6 }));
        assertEquals(27, exercise02.evenNumbersMinusOddNumbers(new int[] { -23, 7, 8, 24, 15, -6, 0 }));
        assertEquals(0, exercise02.evenNumbersMinusOddNumbers(new int[] { }));
    }
}
