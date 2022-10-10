package com.heima.create;

public class ArrayMax {
    public static void main(String[] args) {

        int[] scores = {15, 9000, 10000, 20000, 9500, -5};
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max)
                max = scores[i];
        }
        System.out.println(max);
    }
}
