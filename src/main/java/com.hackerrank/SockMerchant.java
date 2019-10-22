package com.hackerrank;

import java.util.Arrays;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int pairCount=0;
        int prev =0;
        Arrays.sort(ar);
        for (int i=0; i < n; i ++ ) {
            if (i != 0) {
                prev = ar[i-1];
            }
            if (prev == ar[i]) {
                ++pairCount;
                i++;
            }
        }
        return pairCount;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(n, ar);
        System.out.println("Result = " + result);
    }
}
