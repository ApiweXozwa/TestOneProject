package org.example;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

    /**
     * Unit test for simple App.
     */
    public class testOneProject {
        /**
         * Rigorous Test :-)
         */
        @Test
        public void shouldAnswerWithTrue()
        {
            boolean condition = true;
            assertTrue(condition);
        }
        @Test
        public void testEquality(){
            int [] ar1 = {12, 16, 7, 19};
            int [] ar2 = {12,16,7,19};

            Assert.assertEquals(ar1,ar2);

        }

        @Test
        public void testIdentity(){
            int [] ar1 = {12, 16, 7, 19};
            int [] ar2 = {12,16,7,19};

            System.out.println(ar1 == ar2);
        }

        @Test
        public void failTest(){
            int [] ar1 = {12, 16, 7, 19};
            int [] ar2 = {12,16,7,19};

            assertNotSame(ar1,ar2);
        }

        @Test (timeout = 50)
        public void testTimeout(){
            for (int i = 0; i < 10 ; i++) {
                System.out.print(i);

            }
        }

        @Ignore
        @Test
        public void disableTes(){
            int [] ar1 = {12, 16, 7, 19};
            int [] ar2 = {12,16,7,19};

            assertNotSame(ar1,ar2);

        }

        private void assertNotSame(int[] ar1, int[] ar2) {

        }
    }
