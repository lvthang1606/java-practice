package com.exercise.basic.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise02Test {
    @Test
    void checkIfStringIsSymmetric() {
        final Exercise02 exercise02 = new Exercise02();
        assertEquals(true, exercise02.isStringSymmetric("ababa"));
        assertEquals(false, exercise02.isStringSymmetric("aBbacd"));
        assertEquals(true, exercise02.isStringSymmetric("T"));
        assertEquals(true, exercise02.isStringSymmetric("    "));
        assertEquals(true, exercise02.isStringSymmetric(""));
    }
}
