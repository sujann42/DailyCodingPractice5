package com.strings;

public class DuplicateCharsInString {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(isUniqueChars(str));
    }

    public static boolean isUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (temp == str.charAt(j)) {
                    return false;
                }

            }
        }

        return true;
    }
}
