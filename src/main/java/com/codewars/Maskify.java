package com.codewars;

public class Maskify {
    public static String maskify(String str) {
        String result = "";
        int length = str.length();
        if (length > 4) {
            for (int i = 0; i < length - 4; i++) {
                result += "#";
            }
            result += str.substring(str.length() - 4, str.length());
        } else {
            result = str;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("4556364607935616"));
    }
}
