package org.project.j8.example.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.DoubleSupplier;

/**
 * Created by Andres_2 on 23/10/2016.
 */
public class BasicLambdaTest {


    @Test
    public void test1(){

        IPredicate<Integer> isOdd = n -> n % 2 != 0;
        Assert.assertEquals(isOdd.test(5),true);

    }

    @Test
    public void test2(){

        IPredicate<Integer> isOdd = n -> n % 2 != 0;
        Assert.assertEquals(isOdd.test(4),false);

    }

}
