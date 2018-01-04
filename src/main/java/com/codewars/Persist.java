package com.codewars;


public class Persist {
//    static int num;

    public static long persistence(long number) {
        int num = 0;
        long result = 1;
        String valueOf = String.valueOf(number);

        if (valueOf.length() > 1) {
            for (int i = 0; i < valueOf.length(); i++) {
                char i1 = valueOf.charAt(i);
                int c = Integer.valueOf(i1);
                result *= Character.getNumericValue(c);
            }
            num++;
        } else {
            return num;
        }

//        System.out.println("number: " + number + " result:" + result);

        return persistence(result);
    }

    public static void main(String[] args) {
        System.out.println(Persist.persistence(25));
//        System.out.println(Persist.num);
    }
}
