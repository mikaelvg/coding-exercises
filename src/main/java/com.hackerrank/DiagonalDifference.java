package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();
        int value1 = 0;
        int value2 = 0;
        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {

                if (i == j) {
                    value1 = arr.get(i).get(j) + value1;
                    System.out.println(value1);
                }
                int a = i;
                int b = size -1 - i;
                if ((i == a) && (j == b))  {
                    value2 = arr.get(i).get(j) + value2;
                    System.out.println(value2);
                }
            }
        }
        return Math.abs(value1-value2);
    }
    public static void main(String[] args) {


        List<Integer> arrRowItems1 = new ArrayList<>();
        arrRowItems1.add(11);
        arrRowItems1.add(2);
        arrRowItems1.add(4);
        List<Integer> arrRowItems2 = new ArrayList<>();
        arrRowItems2.add(4);
        arrRowItems2.add(5);
        arrRowItems2.add(6);
        List<Integer> arrRowItems3 = new ArrayList<>();
        arrRowItems3.add(10);
        arrRowItems3.add(8);
        arrRowItems3.add(-12);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(arrRowItems1);
        arr.add(arrRowItems2);
        arr.add(arrRowItems3);

        int result = diagonalDifference(arr);
        System.out.println("Result = " + result);

    }
}
