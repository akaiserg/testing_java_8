package org.project.j8.example.builtinFunctions;

import org.junit.Test;

import java.util.function.Supplier;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class BasicSupplierTest {

    @Test
    public void checkSupplier(){

        Supplier<BasicSupplier> basicSupplierFactory = BasicSupplier::new;
        BasicSupplier basicSupplier = basicSupplierFactory.get();
        String value =  basicSupplier.returnString();
        assertThat(value,is(instanceOf(String.class)));

    }

}