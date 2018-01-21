package com.codewars;

import java.util.Arrays;

public class Kata {
    public static int[] foldArray(int[] array, int runs) {
        int[] result;
        if (runs > 0) {
            int length = array.length;
            int size;
            if (length % 2 != 0)
                size = (length / 2) + 1;
            else
                size = length / 2;

            result = new int[size];
            for (int i = 0; i < size; i++) {
                if (length / 2 + 1 == size && i == size - 1) {
                    result[i] = array[i];
                } else
                    result[i] = array[i] + array[length - i - 1];
            }
            runs--;
        } else {
            return array;
        }
        return foldArray(result, runs);
    }

    public static long factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] expected = new int[]{6, 6, 3};
        System.out.println(Arrays.toString(Kata.foldArray(input, 3)));
//        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.foldArray(input, 1)));
    }
}
