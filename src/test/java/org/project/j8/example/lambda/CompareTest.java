package org.project.j8.example.lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Andres_2 on 13/10/2016.
 */
public class CompareTest {

    private Compare compare;


    @Before
    public void setUp(){

        compare = new Compare();

    }

    @Test
    public void checkCompareOld(){

        ArrayList<String> list = new ArrayList<String>();
        list.add("Peter");
        list.add("Jean");
        list.add("Antony");

        list = compare.compareOld(list);
        assertEquals(list.get(0),"Antony");

    }

    @Test
    public void checkCompare(){

        ArrayList<String> list = new ArrayList<String>();
        list.add("Peter");
        list.add("Jean");
        list.add("Antony");

        list = compare.compareLamba(list);
        assertEquals(list.get(0),"Antony");

    }

}