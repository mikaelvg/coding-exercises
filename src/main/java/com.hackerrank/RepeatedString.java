package com.hackerrank;

import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

public class RepeatedString {

    static int repeatedString(String s, long n) {

        int count = 0;
        long stringLength = s.length();
        String strFull = "";
        String strTrim = "";
        long loopCount = (long) Math.ceil(n/stringLength);



        return count;
    }

    public static void main(String[] args) {
        int result = repeatedString("aba", 10);
        System.out.println("Result = " + result);
    }
}

