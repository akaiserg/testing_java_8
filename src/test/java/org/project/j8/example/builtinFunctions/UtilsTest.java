package org.project.j8.example.builtinFunctions;

import org.junit.Test;

import java.util.function.Function;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class UtilsTest {

    @Test
    public  void testUtil(){

        Function<Integer, Function<Integer,Integer>> makeAdder = Utils::adder;
        Function<Integer, Integer> add1 = makeAdder.apply(23);
        Integer val = add1.apply(12);
        assertThat(val.intValue(),is(35));

    }
}