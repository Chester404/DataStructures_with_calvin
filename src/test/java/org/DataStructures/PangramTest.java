package org.DataStructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PangramTest {

    @Test
    public void is_a_Pangram(){
        Assertions.assertTrue(Pangram.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void isNotPangram(){
        Assertions.assertFalse(Pangram.isPangram("") );
    }

    @Test
    void lessThan26_characters() {
        Assertions.assertFalse(Pangram.isPangram("abcdef"));
    }

    @Test
    void isNotComplete_pangram() {
        Assertions.assertFalse(Pangram.isPangram("abcdefghijklmnopqrstuvwsbf"));
    }
}