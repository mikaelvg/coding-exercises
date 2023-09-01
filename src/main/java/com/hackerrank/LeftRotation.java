package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

    static void leftRotation(int d, List<Integer> arr) {

        /* Requirements
        Problem: https://www.hackerrank.com/challenges/array-left-rotation/problem
        A left rotation operation on an array of size  shifts each of the array's elements
        unit to the left. Given an integer, , rotate the array that many steps left and return the result.
        */

        List<Integer> newArr = new ArrayList<Integer>();
        int n = arr.size();
        int effectiveRotation = n - d;

        System.out.println("d = " + d);
        System.out.println("n = " + n);
        System.out.println("effectiveRotation = " + effectiveRotation);

        for (int i = 0; i < n; i++) {
            int newIndex = (i - effectiveRotation + n) % n;
//            System.out.println("newIndex = " + newIndex);
            System.out.println("RotatedArray = " + arr.get(newIndex));
            newArr.add(arr.get(newIndex));
        }

        System.out.println("newArr = " + newArr.toString());

    }

    public static void main(String[] args)  {

        int d = 2;

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("ArrayList : " + arr.toString());

        leftRotation(d, arr);

    }
}
