package com.deepak.programs;

import java.text.MessageFormat;

public class LargestLowest {

    public static String status(int[] ar) {
        int max = 0, min = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[0] < ar[i]) {
                ar[0] = ar[i];
            }
            max = ar[0];
        }
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[0] > ar[i]) {
                ar[0] = ar[i];
            }
            min = ar[0];
        }
        return MessageFormat.format("Largest and Lowest element is {0} and {1}", max, min);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 3, 9, 5, 1, 6};
        System.out.println(LargestLowest.status(arr));
        //output: Largest and Lowest element is 9 and 1
    }
}
