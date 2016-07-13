package com.crackingcodeinterview;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;



public class RemoveDuplicateCharactersFromAStringTest {


    /*
    Test cases
        1. String does not contain any duplicates, e.g.: abcd
        2. String contains all duplicates, e.g.: aaaa
        3. Null string
        4. Empty string
        5. String with all continuous duplicates, e.g.: aaabbb
        6. String with non-contiguous duplicates, e.g.: abababa
     */

    private final RemoveDuplicateCharactersFromAString remover = new RemoveDuplicateCharactersFromAString();

    @Test
    public void shouldReturnTrueIfTheWordDontContainAnyDuplicates() {
        String input = "abcd";
        String inputTransformed = remover.removeDuplicate(input);
        assertThat(input, is(equalTo(inputTransformed)));
    }

    @Test
    public void shouldReturnAStringWithNonRepeatedCharactersForAnInputContainingAllDuplicates() {
        String input = "aaaa";
        String inputTransformed = remover.removeDuplicate(input);
        assertThat(inputTransformed, is(equalTo("a")));
    }


    @Test
    public void shouldReturnTrueIfTheWordIsNull() {
        String input = null;
        String inputTransformed = remover.removeDuplicate(input);
        assertThat(input, is(equalTo(null)));
    }


    @Test
    public void shouldReturnTrueIfTheWordIsEmpty() {
        String input = "";
        String inputTransformed = remover.removeDuplicate(input);
        assertThat(input, is(equalTo("")));
    }


    @Test
    public void shouldRemoveAllContinuousDuplicateCharacters(){
        String input = "aaabbb";
        String inputTransformed = remover.removeDuplicate(input);
        assertThat(inputTransformed, is(equalTo("ab")));
    }


    @Test
    public void shouldRemoveAllNonContiguousDuplicateCharacters(){
        String input = "ababab";
        String inputTransformed = remover.removeDuplicate(input);
        assertThat(inputTransformed, is(equalTo("ab")));
    }
}
