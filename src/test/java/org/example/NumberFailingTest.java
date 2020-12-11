package org.example;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberFailingTest {
    @Test
    public void isNumber() {
        assertTrue(new Number().isNumber(200));
    }
}
