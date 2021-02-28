package com.hackerrank;

public class BreakingRecords {

    static int[] breakingRecords(int[] scores) {

        /*
        Problem: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
         */

        int minCount=0;
        int maxCount=0;
        int minHolder=0;
        int maxHolder=0;

        // Set the first scores from the first game.
        minHolder = scores[0];
        maxHolder = scores[0];

        for (int i=0; i < scores.length; i++) {
            System.out.println(scores[i]);

            if (scores[i] > maxHolder) { // If greater than the last score
                maxCount++;
                maxHolder = scores[i];

            } else if (scores[i] < minHolder) { // If less than the last score
                minCount++;
                minHolder = scores[i];
            } // else, do nothing.
        }

        System.out.println(minCount);
        System.out.println(maxCount);
        int[] ar = {maxCount, minCount};
        return ar;

    }

    public static void main(String[] args)  {
        int[] ar = {12, 24, 10, 24};
        int[] result = breakingRecords(ar);
    }
}
