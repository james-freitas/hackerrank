package com.crackingcodeinterview;

public class RemoveDuplicateCharactersFromAString {

    public static void main(String[] args) {

        String s = "aabbcc";

        String part1;
        String part2;

        int i = 0;

        while(i < s.length()) {
            if(  s.indexOf(s.charAt(i))  != s.lastIndexOf(s.charAt(i)) )  {
                part1 = s.substring(0, s.lastIndexOf(s.charAt(i)));
                part2 = i < s.length()-1 ? s.substring(s.lastIndexOf(s.charAt(i + 1)), s.length()) : "";
                s = part1 + part2;
            }
            i++;
        }

        System.out.println(s);

    }

}
