package com.williamdsw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testSoma() {
        int num1 = 1;
        int num2 = 1;
        assertEquals(2, num1 + num2);
    }
}
