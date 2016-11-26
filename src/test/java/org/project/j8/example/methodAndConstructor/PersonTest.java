package org.project.j8.example.methodAndConstructor;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {


    @Test
    public void checkingTheType(){

        PersonFactory<Person> personFactory = Person::new;
        Person p = personFactory.create("test","test");
        Assert.assertTrue(p instanceof  Person);

    }

}