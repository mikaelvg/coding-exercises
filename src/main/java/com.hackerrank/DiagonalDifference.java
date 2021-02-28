package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        /*
        Problem: https://www.hackerrank.com/challenges/diagonal-difference/problem
         */
        int size = arr.size();
        int value1 = 0;
        int value2 = 0;


        // Travers X or horizontal

        System.out.println("size="+size);
        for (int i = 0; i < size; i ++) {

            // Traver Y or vertical
            for (int j = 0; j < size; j ++) {

                // Diagonal from top to down "\" has equal values of X & Y.
                if (i == j) {
                    value1 = arr.get(i).get(j) + value1;
                    System.out.println(value1);
                }

                /* Diagonal from down to top  "/" has equal values of X & Y.
                 Test & visualization. 3X3 matrix.
                 valid values are
                 i=0, j=2
                 i=1, j=1
                 i=2, j=0
                 J has reverse count. To to button
                */

                // Size is 3. Less 1 to match 0,1,2 counting.
                // Formula makes the count as reverse.
                int Y = size- i -1;
                if (j == Y)  {
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
