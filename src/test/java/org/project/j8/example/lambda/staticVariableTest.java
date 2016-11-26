package org.project.j8.example.lambda;
import org.junit.Assert;
import org.project.j8.example.methodAndConstructor.*;

import org.junit.Test;


public class staticVariableTest {


    @Test
    public void  testLocalVariables(){

        final int num = 1;
        IConverter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        String resut = stringConverter.convert(2);
        Assert.assertEquals(resut,"3");

    }

}
