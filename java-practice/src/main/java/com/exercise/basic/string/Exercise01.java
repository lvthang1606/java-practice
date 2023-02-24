package com.exercise.basic.string;

// Tạo một string bằng cách đảo ngược các ký tự từ 1 string cho trước
public class Exercise01 {
    public String reverseString(final String string) {
        String reversedString = new String();
        for (int i = 0; i < string.length(); i++) {
            reversedString = string.charAt(i) + reversedString;
        }
        return reversedString;
    }
}
