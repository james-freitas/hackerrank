package com.crackingcodeinterview;

public class RemoveDuplicateCharactersFromAString {

    public static void main(String[] args) {
        String inputWord = null;

        RemoveDuplicateCharactersFromAString remover = new RemoveDuplicateCharactersFromAString();

        System.out.println(remover.removeDuplicate(inputWord));
    }

    public String removeDuplicates(char[] str){
        if(str == null) {
            return new String(str);
        }
        int len = str.length;

        if(len < 2) {
            return new String(str);
        }

        int tail = 1;

        for (int i = 1; i < len; i++) {
            int j;
            for (j = 0; j < tail; j++) {
                if(str[i] == str[j]){
                    break;
                }
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
        str[tail] = 0;



        return new String(str);

    }

    public String removeDuplicateCharacters(String inputWord){
        int i = 0;

        String part1;
        String part2;

        if(inputWord == null) {
            return "";
        }

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


    public String removeDuplicate(String inputWord) {
        int i = 0;
        int j;

        if(inputWord == null) {
            return "";
        }

        if(inputWord.isEmpty()) {
            return "";
        }

        while (i < inputWord.length()) {
            j = i + 1;
            while( j < inputWord.length() ) {
                if(inputWord.charAt(i) == inputWord.charAt(j)){
                    inputWord = inputWord.substring(0, i+1) + inputWord.substring(j + 1, inputWord.length() );
                }
                j++;
            }
            i++;
        }
        return inputWord;
    }

}
