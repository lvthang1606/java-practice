package com.exercise.basic.numerals;

// Viết chương trình tìm tổng các chữ số của một số nguyên
public class Exercise02 {
    public int findSumDigitsOf(final int number) {
        // The sum of digits of number
        int sum = 0;
        // Temporary variable, to not change the value of the input number
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}
