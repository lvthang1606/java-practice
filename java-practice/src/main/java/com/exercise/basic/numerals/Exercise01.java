package com.exercise.basic.numerals;

// Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên
public class Exercise01 {
    public int findGreatestCommonDivisor(int number1, int number2) {
        // The greatest common divisor of number1 and number2
        int greatestCommonDivisor = 1;
        for(int i = 1; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }

    public int findLeastCommonMultiple(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            return 0;
        }
        int greatestCommonDivisor = findGreatestCommonDivisor(number1, number2);
        // The least common multiple of number1 and number2
        int leastCommonMultiple = (number1 * number2) / greatestCommonDivisor;
        return leastCommonMultiple;
    }
}