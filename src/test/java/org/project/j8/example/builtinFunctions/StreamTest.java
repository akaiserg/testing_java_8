package org.project.j8.example.builtinFunctions;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.StringContains.containsString;

public class StreamTest {

    private List<String> stringCollection;

    @Before
    public void setup(){


        stringCollection = new ArrayList<String>();
        stringCollection.add("ccc2");
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        stringCollection.add("ccc1");


    }


    @Test
    public void filterTest(){

        List<String> found = stringCollection
                .stream()
                .filter((s) -> s.contains("a"))
                .collect(Collectors.toList());

        Assert.assertThat(found.size(), is(2));
    }

    @Test
    public void sortTest(){

        List<String> found = stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.contains("c"))
                .collect(Collectors.toList());

        Assert.assertThat(found.get(0), is("ccc"));
    }

    @Test
    public void mapTest(){

         stringCollection
                .stream()
                .map((s)->s+",")
                .forEach((s)->Assert.assertThat(s,containsString(",")));

    }

    @Test
    public void matchAnyMatchTest(){

        boolean result = stringCollection
                .stream()
                .anyMatch((s)->s.contains("s"));
        Assert.assertFalse(result);

    }

    @Test
    public void matchAllMatchTest(){

        boolean result = stringCollection
                .stream()
                .allMatch((s)->s.contains("a"));
        Assert.assertFalse(result);

    }

    @Test
    public void matchNoneMatchTest(){

        boolean result = stringCollection
                .stream()
                .noneMatch((s)->s.contains("z"));
        Assert.assertTrue(result);

    }

    @Test
    public void countTest(){

        long count = stringCollection
                .stream()
                .filter((s) -> s.contains("a"))
                .count();
        Assert.assertThat(count,is(2L));

    }

    @Test
    public void reduceTest(){

        Optional value = stringCollection
                .stream()
                .sorted()
                .reduce((s1,s2)-> s1+" , "+s2);

        Assert.assertTrue(value.isPresent() == true );
        Consumer<String> print = (s) -> System.out.println(s);
        value.ifPresent(print);

    }

}
