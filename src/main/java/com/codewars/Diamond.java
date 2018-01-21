package com.codewars;

class Diamond {
    public static String print(int n) {
        StringBuffer result = new StringBuffer();
        if (n > 0 && n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                int numOf = n / 2 - i;
                for (int j = 0; j < Math.abs(numOf); j++) {
                    result.append(" ");
                }
                if (n / 2 >= i) {
                    for (int j = 0; j < i * 2 + 1; j++) {
                        result.append("*");
                    }
                } else {
                    for (int j = 1; j < (n - i) * 2; j++) {
                        result.append("*");
                    }
                }
                result.append("\n");
            }
        } else {
            return null;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.print(print(8));
        System.out.println("df");
//        StringBuffer expected = new StringBuffer(print(5));
//        System.out.println(expected.reverse().toString());
    }
}
