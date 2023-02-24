package com.exercise.basic.string;

// Kiểm tra một chuỗi ký tự có đối xứng hay không
public class Exercise02 {
    public boolean isStringSymmetric(final String string) {
        if (string.length() == 0 || string.length() == 1) {
            return true;
        }
        // The reversed string of the original one
        String reversedString = new String();
        for (int i = 0; i < string.length(); i++) {
            reversedString = string.charAt(i) + reversedString;
        }
        return string.equals(reversedString);
    }
}
