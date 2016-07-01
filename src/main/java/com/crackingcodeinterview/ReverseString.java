package com.crackingcodeinterview;

public class ReverseString {

    public static void main(String[] args) {

        String s = reverseUsingStringBuilder();
        System.out.println(s);

        System.out.println(reverseUsingHalfAlgorithm("abc"));

    }

    private static String reverseUsingHalfAlgorithm(String orig) {
        char[] s = orig.toCharArray();
        int n = s.length;
        int halfLenght = n / 2;
        for (int i = 0; i < halfLenght; i++) {
            char temp = s[i];
            s[i] = s[n -1 -i];
            s[n-1-i] = temp;
        }
        return new String(s);
    }

    private static String reverseUsingStringBuilder() {
        return new StringBuilder("abc").reverse().toString();
    }

}
