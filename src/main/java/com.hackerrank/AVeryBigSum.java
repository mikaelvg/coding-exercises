package com.hackerrank;

public class AVeryBigSum {

    static long aVeryBigSum(long[] ar) {
        long l = 0L;
        for (int i = 0; i < ar.length; i++) {
            //int el = arr.indexOf(i);
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
