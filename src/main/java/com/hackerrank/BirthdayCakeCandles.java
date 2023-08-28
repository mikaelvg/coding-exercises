package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        /*
        Problem: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
         */
        int max = getMax(candles); // Get the highest value only.
        int candleCounter = 0;
        for(int i=0; i<candles.size(); i++ ) {
            if (max == candles.get(i)) { // How many has the highest value.
                candleCounter ++;
            }
        }
        return candleCounter;
    }

    public static  int getMax(List<Integer> candles) {
        int max = 0;
        for(int i=0; i < candles.size(); i++ ) {
            if(candles.get(i)>max) {
                max = candles.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(3);
        int result = birthdayCakeCandles(a);
        System.out.println("Result = " + result);
    }
}
