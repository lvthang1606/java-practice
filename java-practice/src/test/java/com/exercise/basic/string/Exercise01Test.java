package com.exercise.basic.string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise01Test {
    @Test
    void reverseString() {
        final Exercise01 exercise01 = new Exercise01();
        assertEquals("gnahT", exercise01.reverseString("Thang"));
        assertEquals("eL gnahT", exercise01.reverseString("Thang Le"));
        assertEquals("avaJ", exercise01.reverseString("Java"));
        assertEquals("", exercise01.reverseString(""));
    }
}
