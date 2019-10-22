package com.hackerrank;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        int fromValley =0;
        int level = 0;
        for (int i=0; i < n; i ++) {
            String subStr = s.substring(i,i+1);
            if (subStr.equals("U")) {
                level++;
            } else {
                level--;
            }
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
