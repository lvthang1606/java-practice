package com.exercise.basic.numerals;

// Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên
public class Exercise01 {
    public int findGreatestCommonDivisor(final int number1, final int number2) {
        // The greatest common divisor of number1 and number2
        int greatestCommonDivisor = 1;
        // The minimum of number1 and number2
        final int minimum = Math.max(number1, number2);
        for (int i = minimum; i >= 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                greatestCommonDivisor = i;
                break;
            }
        }
        return greatestCommonDivisor;
    }

    public int findLowestCommonMultiple(final int number1, final int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        final int greatestCommonDivisor = findGreatestCommonDivisor(number1, number2);
        return (number1 * number2) / greatestCommonDivisor;
    }
}