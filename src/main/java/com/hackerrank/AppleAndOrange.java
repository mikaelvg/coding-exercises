package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        /* Requirements
        Problem: https://www.hackerrank.com/challenges/apple-and-orange/problem
        s: integer, starting point of Sam's house location.
        t: integer, ending location of Sam's house location.
        a: integer, location of the Apple tree.
        b: integer, location of the Orange tree.
        apples: integer array, distances at which each apple falls from the tree.
        oranges: integer array, distances at which each orange falls from the tree.

        Coding Conditions
        apples[] should be greater than S but less T
        orange[] should be greater than T but less S
        */

        int appleCounter = 0;
        int orangeCounter = 0;
        int distance = b - a; // Distance between the two tree

        System.out.println("distance between 2 trees =" + distance);
        System.out.println("s=" + s); //House starting point
        System.out.println("t=" + t); //House end point
        System.out.println("a=" + a); //Apple point
        System.out.println("b=" + b); //Orange point

        for (int i = 0; i < apples.size(); i++) {
            // Location of apple tree + the distance fruit where it falls.
            // Use AND operator to check if within range. After A && before T.
            if (a + apples.indexOf(i) >= s && a + apples.indexOf(i) <= t) {
                ++appleCounter;
            }
        }
        for (int i = 0; i < oranges.size(); i++) {
            if (b + oranges.indexOf(i) >= s && b + oranges.indexOf(i) <= t) {
                ++orangeCounter;
            }
        }

        // This is the answer. Return no required.
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }

    public static void main(String[] args)  {

        int s = 7;
        int t= 11;
        int a = 5;
        int b = 15;

        List<Integer> apples = new ArrayList<Integer>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        System.out.println("Apple ArrayList : " + apples.toString());

        List<Integer> oranges = new ArrayList<Integer>();
        oranges.add(5);
        oranges.add(-6);
        oranges.add(1);

        System.out.println("Orange ArrayList : " + oranges.toString());

        countApplesAndOranges(s, t, a, b, apples, oranges);

    }
}
