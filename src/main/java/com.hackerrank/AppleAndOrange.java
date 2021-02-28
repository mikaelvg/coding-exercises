package com.hackerrank;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

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
        int distance = b - a;

        System.out.println("distance=" + distance);
        System.out.println("s=" + s);
        System.out.println("t=" + t);
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        for (int i = 0; i < apples.length; i++) {
            // Location of apple tree + the distance fruit where it falls.
            // Use AND operator to check if within range. After A && before T.
            if (a + apples[i] >= s && a + apples[i] <= t) {
                ++appleCounter;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            if (b + oranges[i] >= s && b + oranges[i] <= t) {
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
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};
        countApplesAndOranges(s, t, a, b, apples, oranges);

    }
}
