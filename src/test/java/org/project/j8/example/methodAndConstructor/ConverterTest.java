package org.project.j8.example.methodAndConstructor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Andres_2 on 23/10/2016.
 */
public class ConverterTest {



    @Test
    public void interfaceTest(){

        IConverter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        assertTrue(converted == 123);
    }

    @Test
    public void interfaceStaticMethodreference(){

        IConverter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        assertTrue(converted == 123);
    }

}