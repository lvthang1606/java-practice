package com.exercise.basic.numerals;

// Viết chương trình tìm tổng các chữ số của một số nguyên
public class Exercise02 {
    public int findSumDigitsOf(int number) {
        // The sum of digits of number
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
