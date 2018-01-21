package com.codewars;


import java.util.Arrays;

class Solution {

    static String toCamelCase(String s) {
        String result = "";
        String[] words = s.split("[-||_]");
        for (int i = 0; i < words.length; i++) {
            if (i != 0) {
                words[i] = makeCapitalLetter(words[i]);
            }
            result += words[i];
        }
        return result;
    }

    private static String makeCapitalLetter(String word) {
        char[] charArray = word.toCharArray();
        char ch = charArray[0];
        if (ch >= 97 && ch <= 122) {
            ch = (char) (charArray[0] - 32);
            charArray[0] = ch;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-sarrior"));
        System.out.println(toCamelCase("the_Stealth_Warrior"));
    }
}
