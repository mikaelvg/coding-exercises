package com.hackerrank;

import java.text.DecimalFormat;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        double size = arr.length;
        double zero = 0d;
        double positive = 0d;
        double negative = 0d;
        double  z = 0.000000d;
        double  p = 0.000000d;
        double  n = 0.000000d;

        DecimalFormat df = new DecimalFormat("#.######");
        df.format(0.912385);

        for (int i = 0; i < size; i ++) {
            if (arr[i] == 0 ) {
                zero ++;
            } else if (arr[i] < 0) {
                positive ++;
            } else {
                negative ++;
            }
        }

        if (zero !=0d) {
            z = Double.parseDouble(df.format(zero/size));
        }
        if (positive !=0d) {
            p = Double.parseDouble(df.format(positive/size));
        }
        if (negative !=0d) {
            n = Double.parseDouble(df.format(negative/size));
        }

        System.out.println(n);
        System.out.println(p);
        System.out.println(z);

    }

    public static void main(String[] args) {
        int[] arr = new int[] {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }
}

