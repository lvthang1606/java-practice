package com.exercise.basic.array;

// Viết chương trình tìm số lớn nhất trong một mảng số nguyên
public class Exercise01 {
    public int findLargestNumberIn(final int[] array) {
        if (array.length == 0) {
            return 0;
        }
        // The largest number of the array
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}
