package com.deepak.programs;

import java.util.Arrays;

public class Anagram {

    public static boolean status(String s1, String s2) {
        //removing white space
        String s11 = s1.replaceAll("\\s", "").trim().toLowerCase();
        String s22 = s2.replaceAll("\\s", "").trim().toLowerCase();

        if (s11.length() != s22.length()) {
            return false;
        } else {
            char[] arr1 = s11.toCharArray();
            char[] arr2 = s22.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
    }

    public static void main(String[] args) {
        String s1 = " HoW are you deepak     ";
        String s2 = " ARE  how       deepak you ";
        System.out.println(Anagram.status(s1, s2));
        //output: true
    }
}
