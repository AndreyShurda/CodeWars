package com.codewars;

public class SpinWords {
    public String spinWords(String sentence) {
        String result = "";
        String[] strings = sentence.split(" ");

        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];

            StringBuilder builder;
            if (word.length() >= 5) {
                builder = new StringBuilder(word);
                builder.reverse();
                result += builder;
            } else {
                result += word;
            }

            if (i < strings.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}
