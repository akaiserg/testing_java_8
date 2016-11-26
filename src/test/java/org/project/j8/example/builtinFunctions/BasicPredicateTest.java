package org.project.j8.example.builtinFunctions;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class BasicPredicateTest {

    static  private Function<Integer,Integer> add1 = x -> x + 1;

    @Test
    public void testIsEmpty(){

        BasicPredicate basicPredicate = new BasicPredicate();
        boolean returned = basicPredicate.isEmpty("sa");
        Assert.assertTrue(returned);

    }

    @Test
    public void testHasMoreLetterThan(){

        BasicPredicate basicPredicate = new BasicPredicate();
        boolean returned = basicPredicate.hasMoreLetterThan("abcdefg",5);
        Assert.assertTrue(returned);

    }

    @Test
    public void testAnonymousFunction1(){

        Function<Integer,Integer> add1 = x -> x + 1;
        assertThat(add1.apply(10).intValue(),is(11));

    }

    @Test
    public void testAnonymousFunction2(){

        Function<String,String> concat = x -> x + 1;
        assertThat(concat.apply("0 + 1 = "),is("0 + 1 = 1"));

    }

}