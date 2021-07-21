package com.deepak.programs;

public class Pallindrome {

    public static boolean status(String logic, String s1) {
        String s2 = s1.trim().toLowerCase();
        StringBuilder sb = new StringBuilder(s2);

        if (logic.equals("one")) {
            return s2.equals(sb.reverse().toString());
        } else {
            sb.setLength(0);
            for (int i = s2.length() - 1; i >= 0; i--) {
                sb.append(s2.charAt(i));
            }
            return s2.equals(sb.toString());
        }
    }

    public static void main(String[] args) {
        String s1 = "   NItin ";
        System.out.println(Pallindrome.status("one", s1));
        //output: true
    }
}
