package com.hackerrank;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        /*
        Problem: https://www.hackerrank.com/challenges/counting-valleys/problem
         */
        int fromValley =0;
        int level = 0;

        for (int i=0; i < n; i ++) {
            String subStr = s.substring(i,i+1); // Only one character.
            // String subStr = s.substring(i); Wrong: This will return from 0 to i String
            System.out.println("subStr="+subStr);

            // Up or down?
            if (subStr.equals("U")) {
                level++;
            } else {
                level--;
            }

            // How many time went back to level 0 or sea level?
            if (subStr.equals("U")) {
                if (level == 0) {
                    fromValley++;
                }
            }
        }
        return fromValley;
    }

    public static void main(String[] args) {
        int n = 8;
        String s = "UDDDUDUU";
        int result = countingValleys(n, s);
        System.out.println("Result = " + result);
    }
}
