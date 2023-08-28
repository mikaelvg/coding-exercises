package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        /*
        Problem: https://www.hackerrank.com/challenges/compare-the-triplets/problem
         */

        List<Integer> R = new ArrayList<>();
        int size = a.size(); // Get one size only. A and B have same size.
        int aCounter = 0;
        int bCounter = 0;

        for (int i = 0; i < size; i ++) {
            if (a.get(i) > (b.get(i))) {
                ++ aCounter;
            } else if (a.get(i) < (b.get(i))) {
                ++ bCounter;
            } else {
                System.out.println("Equal, not points");
            }
        }
        R.add(aCounter);
        R.add(bCounter);
        return R;
    }

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(7);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(6);
        b.add(10);
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.get(0) + " " + result.get(1));
    }

}
