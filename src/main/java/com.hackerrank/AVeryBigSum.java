package com.hackerrank;

public class AVeryBigSum {

    static long aVeryBigSum(long[] ar) {
        /*
        Problem: https://www.hackerrank.com/challenges/a-very-big-sum/problem
        */

        long l = 0L;
        for (int i = 0; i < ar.length; i++) {
            long el = ar[i];
            l = l + el;
        }
        return l;
    }

    public static void main(String[] args) {
        long[] ar = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
        long result = aVeryBigSum(ar);
        System.out.println("Result = " + result);
    }
}
