package com.hackerrank;

public class JumpingOnTheClouds {

    private static int jumpingOnClouds(int[] c) {
        /*
        Problem: https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
         */
        int jumps = 0;
        for (int i = 0; i < c.length; i++) {
            if (c.length - i == 1) return jumps; // This mean you are at the end of clouds.
            if (c.length - i <= 2) return jumps + 1; // This means you cannot jump twice at the 2nd to last.
            if (c[i + 2] != 1) { // Check if you can jump twice but not a Thunder cloud. Then skip
                i++; // Increment the count.
            } // one jump only
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args)  {
        int[] c = {0, 0, 1, 0, 0, 1, 0};
        int result = jumpingOnClouds(c);
        System.out.println("Result = " + result);
    }
}
