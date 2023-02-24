package com.exercise.basic.array;

// Viết chương trình tìm tổng của các số chẵn và trừ đi tổng các số lẻ trong một mảng số nguyên
public class Exercise02 {
     public int evenNumbersMinusOddNumbers(final int[] array) {
        // The result of even numbers minus odd numbers
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result += array[i];
            } else {
                result -= array[i];
            }
        }
        return result;
    }
}
