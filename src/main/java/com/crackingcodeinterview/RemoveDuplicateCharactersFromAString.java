package com.crackingcodeinterview;

public class RemoveDuplicateCharactersFromAString {

    public static void main(String[] args) {
        String inputWord = "aabbcc";

        RemoveDuplicateCharactersFromAString remover = new RemoveDuplicateCharactersFromAString();

        System.out.println(remover.removeDuplicateCharacters(inputWord));
    }

    public String removeDuplicateCharacters(String inputWord){
        int i = 0;

        String part1;
        String part2;

        while(i < inputWord.length()) {
            if(  inputWord.indexOf(inputWord.charAt(i))  != inputWord.lastIndexOf(inputWord.charAt(i)) )  {
                part1 = inputWord.substring(0, inputWord.lastIndexOf(inputWord.charAt(i)));
                part2 = i < inputWord.length()-1 ? inputWord.substring(inputWord.lastIndexOf(inputWord.charAt(i + 1)), inputWord.length()) : "";
                inputWord = part1 + part2;
            }
            i++;
        }
        return inputWord;
    }

}
