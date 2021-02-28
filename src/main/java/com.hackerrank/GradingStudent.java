package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class GradingStudent {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<Integer>();

        for (int i = 0; i < grades.size(); i++) {

            if (grades.get(i) < 38) {
                // As is
                roundedGrades.add(grades.get(i));
            } else {
                int currentGrade = grades.get(i);
                double floorGrade = 5*(Math.floor(Math.abs(currentGrade/5)));
                double ceilGrade = floorGrade + 5;
                double floorDiff = currentGrade - floorGrade;

                System.out.println ("currentGrade" + currentGrade);
                System.out.println ("floorGrade" + floorGrade);
                System.out.println ("ceilGrade" + ceilGrade);
                System.out.println ("floorDiff" + floorDiff);

                if (floorDiff <= 2) {
                    roundedGrades.add(grades.get(i));
                } else {
                    roundedGrades.add((int)ceilGrade);
                }
            }
        }
        return roundedGrades;
    }

    public static void main(String[] args) {
        long[] ar = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
        //long result = GradingStudent(ar);
        //System.out.println("Result = " + result);
    }
}
