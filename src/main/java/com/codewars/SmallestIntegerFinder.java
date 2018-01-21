package com.codewars;

import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int arg : args) {
            if (arg < min)
                min = arg;
        }

        return min;
    }

}
