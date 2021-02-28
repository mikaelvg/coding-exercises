package com.hackerrank;

import java.util.Arrays;

public class LonelyInteger {

    static int lonelyinteger(int[] a) {
        /*
        Problem: https://www.hackerrank.com/challenges/lonely-integer/problem
         */

        int prevValue = -1;
        int uniqueValue = -1;
        int currentValue;
        int notMatchCounter = 0; // if 2, then get prev value

        Arrays.sort(a); // Sort the array and out similar values to gether

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            currentValue = a[i];
            uniqueValue = a[i]; // if array count = 1 & the last number is the unique number.

            // Ex. from 2 to 3 2 2->3 3
            if (prevValue != currentValue) {
                notMatchCounter ++;
            }

            // Reset the counter if two same consecutive values
            if (prevValue == currentValue) {
                notMatchCounter = 0;
            }

            // Increment twice in a row Ex. from 2 to 4  2 2 -> 3 -> 4
            if (notMatchCounter == 2) {
                uniqueValue = prevValue; // 3, the prev value is unique/
                break;
            }
            prevValue = a[i];
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

