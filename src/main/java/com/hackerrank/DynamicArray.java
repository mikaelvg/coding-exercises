package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

    // https://www.hackerrank.com/challenges/dynamic-array/problem

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        // Where n is number of row (list)


        // Declare a 2-dimensional empty arrays. All arrays are zero indexed.
        List<List<Integer>> intArrList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            intArrList.add(new ArrayList<>());
        }

        List<Integer> intResultList = new ArrayList<>();
        int lastAnswer = 0;

        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                intArrList.get(idx).add(y);
            } else if (type == 2) {
                int size = intArrList.get(idx).size();
                lastAnswer = intArrList.get(idx).get(y % size);
                intResultList.add(lastAnswer);
            }
        }

        return intResultList;
    }

    public static void main(String[] args)  {
        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> intResultList = new ArrayList<>();

        // Populate the queries list with the provided data
        queries.add(Arrays.asList(1, 0, 5));
        queries.add(Arrays.asList(1, 1, 7));
        queries.add(Arrays.asList(1, 0, 3));
        queries.add(Arrays.asList(2, 1, 0));
        queries.add(Arrays.asList(2, 1, 1));
        intResultList = dynamicArray(2, queries);
        System.out.println(intResultList.toString());
    }
}
