package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertSame;
public class UserDisablingTest {
    @Test
    @Ignore  //@Disabled in JUnit 5
    public void testObjectIdentity()throws Exception{
        User admin = new User("admin","@!peACEXO");
        User newUser = new User("admin", "ACEXOZ");
        newUser = admin;

        assertSame(admin, newUser);
    }
}
