package com.crackingcodeinterview

class GroovyReverseString {

    public static void main(String[] args) {

        String s = "abc"
        Stack<Character> stack = new Stack<>();

        s.each { c -> c
            stack << c
        }

        String reversed = ""

        while (!stack.isEmpty()) {
            reversed += stack.pop().toString()
        }

        println reversed

    }
}
