package com.hackerrank;

public class Staircase {

    static void staircase(int n) {

        for (int x = 0; x < n; x++) {
            int a = n - x ;
            for (int y = 0; y < a; y++) {
                if (y == (a-1)) {
                    int q = n - y;
                    for (int m = 1; m < q + 1; m++) {
                        System.out.print("#");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        staircase(95);
    }
}
