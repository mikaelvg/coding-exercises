package com.hackerrank;

public class JumpingOnTheClouds {

    private static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for (int i = 0; i < c.length; i++) {
            if (c.length - i == 1) return jumps;
            if (c.length - i <= 2) return jumps + 1;
            if (c[i + 2] != 1) {
                i++;
            }
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
