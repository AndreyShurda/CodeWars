package com.codewars;

public class Kate {
    public static String getMiddle(String word) {

        String result = "";
        int lengthWord = word.length();

        int half = lengthWord / 2;

        if (lengthWord > 1) {
            if (lengthWord % 2 == 0) {
                result = word.substring(half - 1, half + 1);
            } else {
                result = String.valueOf(word.charAt(half));
            }
        } else {
            result = word;
        }
        return result;
    }

}
