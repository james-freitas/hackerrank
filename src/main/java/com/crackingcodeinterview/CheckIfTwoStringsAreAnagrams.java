package com.crackingcodeinterview;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagrams {

    public static void main(String[] args) {

        String s1 = "aba";
        String s2 = "aab";

        if (s1.length() != s2.length()){
            System.out.println("They are not anagrams");
            System.exit(0);
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean areAnagrams = true;

        for (int i = 0; i < c1.length; i++) {
            if(c1[i] != c2[i]) {
                System.out.println("They are not anagrams");
                System.exit(0);
            }
        }

        System.out.println("They are anagrams");



    }

}
