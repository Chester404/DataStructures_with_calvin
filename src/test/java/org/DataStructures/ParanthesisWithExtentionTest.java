package org.DataStructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.DataStructures.ParanthesisWithExtention.bracesMap;
import static org.DataStructures.ParanthesisWithExtention.result;
import static org.junit.jupiter.api.Assertions.*;

class ParanthesisWithExtentionTest {
    @Test
    void paranthesisIsBalanced() {
        Assertions.assertTrue(ParanthesisWithExtention.isBalanced(result));
    }

    @Test
    void paranthesisIsNotBalanced() {
        Assertions.assertFalse(ParanthesisWithExtention.isBalanced(result));
    }

    @Test
    void noParenthesis() {
      //  Assertions.assertFalse(ParanthesisWithExtention.isBalanced(ParanthesisWithExtention.bracesMap(ParanthesisWithExtention.noAlphabets("and"))));
    }
}