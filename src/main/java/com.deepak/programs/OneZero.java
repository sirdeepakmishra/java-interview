package com.deepak.programs;

import java.text.MessageFormat;
import java.util.Arrays;

public class OneZero {

    public static String count(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                c++;
            } else break;
        }
        return MessageFormat.format("Zeros are {0} and ones are {1}", c, arr.length - c);
    }

    public static void main(String[] args) {
        String s = "01110101010101010110101100000111010";
        System.out.println(OneZero.count(s));
        //output: Zeros are 16 and ones are 19
    }
}
