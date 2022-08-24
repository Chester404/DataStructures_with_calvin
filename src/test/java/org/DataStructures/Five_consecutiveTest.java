package org.DataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Five_consecutiveTest {
    @Test
    void highestSum() {
        assertEquals(Five_consecutive.consecutive("1-2-3-4-5"),15);
    }

    @Test
    void lessThan5() {
        assertEquals(Five_consecutive.consecutive("1-2-"), 0);
    }
}