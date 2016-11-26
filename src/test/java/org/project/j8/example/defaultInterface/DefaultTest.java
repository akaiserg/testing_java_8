package org.project.j8.example.defaultInterface;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DefaultTest {


    IDefault d;

    @Before
    public  void setUo(){

        d = new Default();

    }

    @Test
    public void checkType(){

        assertTrue(d instanceof  IDefault);

    }

    @Test
    public void checkDefaultInterface(){

        String test = "hello";
        assertEquals(d.counter(test),test.length());

    }

}