package com.deepak.programs;

public class ReverseString {

    public String ReverseMethod(String s1) {
        String[] arr = s1.split("\\s");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "HELLO My Name is deepak Mishra ";
        ReverseString obj = new ReverseString();
        System.out.println(obj.ReverseMethod(s1));
        //output : Mishra deepak is Name My HELLO
    }
}
