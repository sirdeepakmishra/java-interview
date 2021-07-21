package com.deepak.programs;

public class Factorial {

    public static int fact(int i) {
        return i == 0 ? 1 : i * fact(i - 1);
    }

    public static void main(String[] args) {
        System.out.println(Factorial.fact(5));
        //output: 120
    }
}
