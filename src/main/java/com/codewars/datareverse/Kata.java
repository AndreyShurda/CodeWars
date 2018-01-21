package com.codewars.datareverse;

import java.util.Arrays;

public class Kata {
    public static int[] DataReverse(int[] data) {
        int[] result = new int[data.length];
        for (int k = data.length / 8, group = 0; k > 0; k--, group++)
            for (int i = 0; i < 8; i++)
                result[(8 * group) + i] = data[8 * (k - 1) + i];

        return result;
    }

    public static void main(String[] args) {
//        int[] data1 = {9, 0, 1, 1, 0, 1, 1, 3, 2, 0, 1, 0, 1, 0, 0, 8};
//        System.out.println(Arrays.toString(DataReverse(data1)));

//        What will be the output of the program?
//        int i = 0;
//        while(1)
//        {
//            if(i == 4)
//            {
//                break;
//            }
//            ++i;
//        }
//        System.out.println("i = " + i);

//        What will be the output of the program?
        for (int i = 0; i < 10; i+=3) {
            System.out.print(i+",");
        }

        int iAns = 25;
        iAns--;
        iAns+=40;
        iAns/=2;
        System.out.println("\n"+iAns);

    }
}

class Example {
    public static void main(String[] args) {
        double values[] = {-2.3, -1.0, 0.25, 4};
        int cnt = 0;
        for (int x = 0; x < values.length; x++) {
            if (Math.round(values[x] + .5) == Math.ceil(values[x])) {
                ++cnt;
            }
        }
        System.out.println("same results " + cnt + " time(s)");
    }
}

//    What will be the output of the program?
class PassA
{
    public static void main(String [] args)
    {
        PassA p = new PassA();
        p.start();
    }

    void start()
    {
        long [] a1 = {3,4,5};
        long [] a2 = fix(a1);
        System.out.print(a1[0] + a1[1] + a1[2] + " ");
        System.out.println(a2[0] + a2[1] + a2[2]);
    }

    long [] fix(long [] a3)
    {
        a3[1] = 7;
        return a3;
    }
}
