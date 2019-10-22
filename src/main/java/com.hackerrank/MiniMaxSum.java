package com.hackerrank;

import java.text.DecimalFormat;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        double min = getMin (arr);
        double max = getMax (arr);
        double minTotal = 0;
        double maxTotal = 0;
        int size = arr.length;

        for(int i=0; i < size; i++){

            // Skip max for min
            if ((arr[i] != max)) {
                minTotal = minTotal + arr[i];
            }

            // Skip min for max
            if ((arr[i] != min)) {
                maxTotal = maxTotal + arr[i];
            }
        }

        if (min == max) {
            maxTotal = arr[0] * (size-1);
            minTotal = arr[0] * (size-1);
        }

        DecimalFormat df = new DecimalFormat("###");
        System.out.println(df.format(minTotal) + " " + df.format(maxTotal));

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
    public static int getMin(int [] array) {
        int min = array[0];
        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        //int[] arr = new int[]{1, 1, 3, 5, 5}; // 10 14
        //int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr = new int[]{256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum(arr);
    }
}
