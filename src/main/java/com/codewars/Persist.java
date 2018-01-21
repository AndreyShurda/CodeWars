package com.codewars;


public class Persist {
    static int num;

    public static long persistence(long number) {
        num = 0;
        return persistence(String.valueOf(number));
    }

    public static long persistence(String valueOf) {
        long result = 1;

        if (valueOf.length() > 1) {
            for (int i = 0; i < valueOf.length(); i++) {
                int c = Integer.valueOf(valueOf.charAt(i));
                result *= Character.getNumericValue(c);
            }
            num++;
        } else {
            return num;
        }

//        System.out.println("number: " + valueOf + " result:" + result);

        return persistence(String.valueOf(result));
    }

    public static void main(String[] args) {
        System.out.println(Persist.persistence(999));
        System.out.println(Persist.persistence(25));
//        System.out.println(Persist.num);
    }
}
