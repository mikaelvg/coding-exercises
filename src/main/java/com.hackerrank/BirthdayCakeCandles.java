package com.hackerrank;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {
        int max = getMax(ar);
        int candles = 0;
        for(int i=0; i<ar.length; i++ ) {
            if (max == ar[i]) {
                candles ++;
            }
        }
        return candles;
    }

    public static  int getMax(int [] array) {
        int max = 0;
        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ar = new int[]{3, 2, 1, 3};
        int result = birthdayCakeCandles(ar);
        System.out.println("Result = " + result);
    }
}
