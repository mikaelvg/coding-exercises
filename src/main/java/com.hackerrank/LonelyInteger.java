package com.hackerrank;

import java.util.Arrays;

public class LonelyInteger {

    static int lonelyinteger(int[] a) {
        int preValue = -1;
        int uniqueValue = -1;
        int currentValue;
        int notMatchCounter = 0; // if 2, then get prev value
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            currentValue = a[i];
            uniqueValue = a[i]; // if array count = 1 & the last number is the unique number.

            if (preValue != currentValue) {
                notMatchCounter ++;
            }

            if (preValue == currentValue) {
                notMatchCounter = 0;
            }

            if (notMatchCounter == 2) {
                uniqueValue = preValue;
                break;
            }
            preValue = a[i];
        };
        return uniqueValue;
    }

    public static void main(String[] args) {
        //int[] a = new int[]{0, 0, 1, 2, 1};
        //int[] a = new int[]{1};
        //int[] a = new int[]{1, 1, 2, 2, 3, 5,5, 7,7};
        //int[] a = new int[]{1, 1, 2};
        int[] a = new int[]{0, 0, 1, 2, 1};
        int result = lonelyinteger(a);
        System.out.println("Result = " + result);
    }
}

