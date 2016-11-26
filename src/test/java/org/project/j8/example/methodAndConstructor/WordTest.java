package org.project.j8.example.methodAndConstructor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Andres_2 on 23/10/2016.
 */
public class WordTest {


    private Word word;


    @Before
    public void setUp(){

        word = new Word();

    }


    @Test
    public  void  checkFirstLetter(){

        IConverter<String, String> converter = word::startWith;
        String  converted =  converter.convert("Java");
        Assert.assertEquals(converted,"J");

    }


    @Test
    public  void  checkValuePlusTen(){

        IsimpleValue<String> converter = word::getValueUpper;
        String value = converter.getValue("j");
        Assert.assertEquals(value,"J");

    }

}