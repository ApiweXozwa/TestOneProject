package org.example;
import org.junit.Test;
import static org.junit.Assert.*;


//TIMEOUT TEST

public class ReverseIntTest {
    @Test(timeout = 3)

    public void reverse() {
        assertEquals(22457863, new ReverseInt().reverse(2245789));
    }
}
