package com.deepak.programs;

public class CommonWords {

    public String CommonMethod(String s1, String s2) {
        String[] arr1 = s1.split("\\s");
        String[] arr2 = s2.split("\\s");
        StringBuilder sb = new StringBuilder();

        for (String s : arr1) {
            for (String value : arr2) {
                if (s.equals(value)) {
                    sb.append(value).append(" ");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "HELLO My Name is deepak Mishra   ";
        String s2 = " deepak how are you ";
        CommonWords obj = new CommonWords();
        System.out.println(obj.CommonMethod(s1, s2));
        //output : deepak
    }
}
