package com.example.hrank;

public class DynamicProgramming {
    public static void main(String[] args) {
        int[] arr = new int[]{4,1,1,4,2,1};
        int maxSumNonAdj = getMaxSumNonAdjacent(arr);

        System.out.println("Max Sum for Non-Adjacent= " + maxSumNonAdj);
    }

    private static int getMaxSumNonAdjacent(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        }

        int inc = arr[0];
        int exc = 0;

        for (int i = 1; i<arr.length; i++) {
            int prevInc = inc;
            inc = Math.max(inc, exc + arr[i]);
            exc = prevInc;
        }
        return inc;
    }

}
