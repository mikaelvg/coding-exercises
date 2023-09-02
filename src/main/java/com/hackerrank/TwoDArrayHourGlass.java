package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoDArrayHourGlass {
    static void solutionMethod(List<List<Integer>> arr) {

        /* Requirements
        Problem: https://www.hackerrank.com/challenges/2d-array/problem
        */

        int size = arr.size();
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i + 2  < size; i++) {
            for (int j = 0; j + 2  < size; j++) {
                sum = 0;
                // Calculate the sum of the current hourglass
                sum += arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                sum += arr.get(i + 1).get(j + 1);
                sum += arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                // Update the maximum sum
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("maxSum = " + maxSum);
    }
    public static void main(String[] args)  {

        List<List<Integer>> arr = new ArrayList<>();

        arr.add(Arrays.asList(-9,-9,-9,1,1,1));
        arr.add(Arrays.asList(0,-9,0,4,3,2));
        arr.add(Arrays.asList(-9,-9,-9,1,2,3));
        arr.add(Arrays.asList(0,0,8,6,6,0));
        arr.add(Arrays.asList(0,0,0,-2,0,0));
        arr.add(Arrays.asList(0,0,1,2,4,0));
        solutionMethod(arr);

    }
}
