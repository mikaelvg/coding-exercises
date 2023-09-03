package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AACommonCodes {
       
    public static void main(String[] args)  {

        // TEST DATA POPULATION  
        int[] intArr = {10000, 10001, 10002};
        System.out.println("intArr" + intArr.toString());

        long[] longArr = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
        System.out.println("longArr" + longArr.toString());

        // List Array
        List<Integer> intArrList = new ArrayList<>();
        intArrList.add(1);
        intArrList.add(2);
        intArrList.add(3);
        System.out.println("intArrList" + intArrList.toString());
        
        //List of List
        List<List<Integer>> intArrlist2 = new ArrayList<>();
        intArrlist2.add(Arrays.asList(1, 0, 5));
        intArrlist2.add(Arrays.asList(1, 1, 7));
        intArrlist2.add(Arrays.asList(1, 0, 3));
        intArrlist2.add(Arrays.asList(2, 1, 0));
        intArrlist2.add(Arrays.asList(2, 1, 1));
        System.out.println("intArrlist2" + intArrlist2.toString());

        int size = intArrlist2.size();
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < intArrlist2.get(i).size(); j++) {
                sum += intArrlist2.get(i).get(j);
                System.out.print(sum);
            }
        }        

        //2D Array
        int[][] int2dArr = new int[3][3]; // 3x3 int2dArr
        int2dArr[0][0] = 1;
        int2dArr[0][1] = 2;
        int2dArr[0][2] = 3;
        int2dArr[1][0] = 4;
        int2dArr[1][1] = 5;

        for (int row = 0; row < int2dArr.length; row++) {
            for (int col = 0; col < int2dArr[row].length; col++) {
                System.out.print(int2dArr[row][col] + " ");
            }
            System.out.println(); // Move to the next row
        }        

        //ARRAY SORTING
        Arrays.sort(intArr);
        Collections.sort(intArrList);




    }
}
