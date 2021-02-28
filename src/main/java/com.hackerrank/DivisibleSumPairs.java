package com.hackerrank;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {

        int divCounter = 0;
        int arCount = ar.length;

        for (int i = 0; i < arCount; i++) {
            System.out.println("------i=" +i);
            for (int j = i; j < arCount; ++j) {
                if (j != arCount-1) {
                    int sum = ar[i] + ar[j + 1];
                    System.out.println(ar[i] + "+" + ar[j + 1]);
                    if(sum % k == 0) {
                        divCounter++;
                    }
                }
            }
        }
        System.out.println("divCounter=" + divCounter);
        return  divCounter;
    }

    public static void main(String[] args)  {
        int n = 6;
        int k = 3;
        //int[] ar = {1, 2, 3, 4, 5, 6};
        int[] ar = {1, 3, 2, 6, 1, 2};

        int result = divisibleSumPairs(n, k, ar);

    }
}
