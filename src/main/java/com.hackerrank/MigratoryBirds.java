package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {

        /*
        Problem: https://www.hackerrank.com/challenges/migratory-birds/problem
        Get the most seen, if equal, then get the lowest ID
         */

        Collections.sort(arr, Collections.reverseOrder()); // Start from top since you need the lowest value.
        int minCounter=0;
        int lastValue=arr.get(0);
        int lastMax=1; // All will start with 1
        int returnValue=0;
        int nextValue=0;

         for (int i = 0; i < arr.size(); i++) {

            // If new number, reset counter
            // Increment minCounter if greater than lastMax. Set the new max
            nextValue = arr.get(i);

            if (lastValue != nextValue){ // When change in Number, reset the the counter
                minCounter =0;
                System.out.println("minCounter=" + minCounter);
            }

            minCounter++; // The increment by 1.

            if (lastMax <= minCounter) { // If the next lower value has the same count or more.
                lastMax = minCounter;
                returnValue = arr.get(i);
            }

            System.out.println(arr.get(i));

            lastValue=arr.get(i); // assign for next loop use.
        }
        return returnValue;
    }


    public static void main(String[] args)  {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);
        arr.add(3);

        int result = migratoryBirds(arr);
        System.out.println("Result = " + result);
    }
}
