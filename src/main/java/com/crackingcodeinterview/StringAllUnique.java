package com.crackingcodeinterview;

public class StringAllUnique {

    public static void main(String[] args) {

        if (isUniqueChars2("aa") ) {
            System.out.println("It's unique");
        } else {
            System.out.println("dont");
        }

        //myIsAllUnique();

    }


    /*
    if ((checker & (1 << val)) > 0) return false;

    What does checker & (1 << val) do? Well, 1 << val creates an int value
    that has all bits zero except for the val th bit. It then uses bitwise
    AND to AND this value with checker. If the bit at position val in checker
    is already set, then this evaluates to a nonzero value (meaning we've
    already seen the number) and we can return false. Otherwise, it evaluates to
    0, and we haven't seen the number.

    The next line is this:

    checker |= (1 << val);

    This uses the "bitwise OR with assignment" operator, which is equivalent to
    checker = checker | (1 << val);
    This ORs checker with a value that has a 1 bit set only at position val, which
    turns the bit on. It's equivalent to setting the valth bit of the number to 1.

     */


    private static boolean isUniqueChars(String str) {
        if (str.length() > 26) { // NOTE: Are you sure this isn't 26?
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

    // book solution
    private static boolean isUniqueChars2(String str){
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    private static void myIsAllUnique() {
        String s = "abcd";
        char c = '\0';
        boolean isUnique = true;
        int count;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if ( c == s.charAt(j)){
                    count++;
                }
            }
            if ( count > 1 ) {
                System.out.println("It is not all unique");
                isUnique = false;
                break;
            }
        }

        if(isUnique) {
            System.out.println("It is all unique");
        }
    }
}
