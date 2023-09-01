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
        int maxSum = 0;
        int sum = 0;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                sum += arr.get(x).get(y) + arr.get(x).get(y + 1) + arr.get(x).get(y + 2);
                sum += arr.get(x + 1).get(y + 1);
                sum += arr.get(x + 2).get(y) + arr.get(x + 2).get(y + 1) + arr.get(x + 2).get(y + 2);
            }
            maxSum = Math.max(maxSum, sum);
            sum = 0;
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
