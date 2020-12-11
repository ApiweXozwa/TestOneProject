package org.example;

// This class tests object equality

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserEqualityTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Testing the equality of 2 objects.");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test completed.");
    }

    @Test
    public void testObjectEquality(){
        User admin = new User("admin","@!peACEXO");
        User superUser = admin;

        admin.changeUserName("Peace");

        assertEquals(admin, superUser);
    }
}
