package org.project.j8.example.builtinFunctions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

import static org.junit.Assert.*;


public class PersonTest {


    @Test
    public void  testConsumer(){

        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.getfName());
        greeter.accept(new Person("Luke", "Skywalker"));

    }

    @Test
    public void  testComparator(){

        Comparator<Person> comparator = (p1, p2) -> p1.getfName().compareTo(p2.getfName());

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");

        assertTrue(comparator.compare(p1, p2) > 0);
        assertTrue(comparator.reversed().compare(p1, p2) < 0);


    }

}