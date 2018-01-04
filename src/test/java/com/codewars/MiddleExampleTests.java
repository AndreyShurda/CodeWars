package com.codewars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MiddleExampleTests {
    @Test
    public void evenTests() {
        assertEquals("es", Kate.getMiddle("test"));
        assertEquals("dd", Kate.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Kate.getMiddle("testing"));
        assertEquals("A", Kate.getMiddle("A"));
    }
}