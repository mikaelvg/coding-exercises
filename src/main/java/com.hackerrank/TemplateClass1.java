package com.hackerrank;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TemplateClass1 {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        List<Integer> listKeyboards = new ArrayList<Integer>();
        int topCost = 0;
        int totalCost = 0;
        int lastTotalCost = 0;

        for (int value : keyboards) {
            listKeyboards.add(value);
        }

        List<Integer> listDrives = new ArrayList<Integer>();
        for (int value : drives) {
            listDrives.add(value);
        }

        // TEST 11
        // 9 7
        // 3 2 1

        Collections.reverse(listKeyboards);
        Collections.reverse(listDrives);

        for (int i=0; i < listKeyboards.size(); i++) {
            for (int j=0; j < listDrives.size(); j++) {
                topCost = listKeyboards.get(i) + listDrives.get(j);
                if (totalCost <= b) { // True again on next loop of keyboards. Should be false. i.e. 7+3
                    topCost = totalCost;
                    System.out.println(topCost);
                    continue;
                }
            }
        }

        return topCost;
    }

    public static void main(String[] args)  {
        //String result = getMoneySpent();
        //System.out.println("Result = " + result);
    }
}
