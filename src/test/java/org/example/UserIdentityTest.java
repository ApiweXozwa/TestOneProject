package org.example;

//Checking the identity of 2 objects

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class UserIdentityTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Testing the identity of 2 objects.");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test completed.");
    }

    @Test
    public void testObjectIdentity()throws Exception{
        User admin = new User("admin","@!peACEXO");
        User newUser = new User("admin", "Peace");
        newUser = admin;

        assertSame(admin, newUser);
    }
}
