package com.codewars;

import java.util.*;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        int numberOfSmiles = 0;
        for (String smile : arr) {
            char eyes = 0;
            char nose = 0;
            char mouth = 0;
            if (smile.length() == 3) {
                eyes = smile.charAt(0);
                nose = smile.charAt(1);
                mouth = smile.charAt(2);
            } else if (smile.length() == 2) {
                eyes = smile.charAt(0);
                nose = 0;
                mouth = smile.charAt(1);
            } else {
                eyes = 0;
                nose = 0;
                mouth = 0;
            }
            if (eyes == ':' || eyes == ';') {
                if (nose == '-' || nose == '~' || nose == 0) {
                    if (mouth == 'D' || mouth == ')') {
                        numberOfSmiles++;
                    }
                }
            }
        }
        return numberOfSmiles;
    }
}
