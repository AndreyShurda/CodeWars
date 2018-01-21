package com.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutives {
    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> result = new ArrayList<Integer>();
        Integer previous = null;
        int sum = 0;
        for (Integer value : s) {
            if (result.size() > 0) {
                previous = result.get(result.size() - 1);
            }
            if (previous != null && previous == value) {
                sum += value;
            } else {
                if (sum != 0) {
                    int index = result.size() - 1;
                    Integer last = result.get(index);
                    result.set(index, last + sum);
                    sum = 0;
                }
                result.add(value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> i = Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3, 1);
        System.out.println(sumConsecutives(new ArrayList<Integer>()));
    }

}
