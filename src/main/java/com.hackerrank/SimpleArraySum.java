package com.hackerrank;

public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        int arCount = ar.length;
        int arTotal = 0;
        for (int arItr = 0; arItr < arCount; arItr++) {
            arTotal =arTotal + ar[arItr];
        }
        return arTotal;
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 10, 11};
        int result = simpleArraySum(ar);
        System.out.println("Result = " + result);
    }
}
