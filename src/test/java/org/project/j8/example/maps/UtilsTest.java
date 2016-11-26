package org.project.j8.example.maps;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class UtilsTest {


    @Test
    public void  computeIfPresentTest(){

        Map<Integer, String> map = Utils.getMap(100);
        map.computeIfPresent(99, (num,val)->null);
        Assert.assertEquals(map.containsKey(99),false);
        
    }

    @Test
    public void  computeIfAbsentTest(){

        Map<Integer, String> map = Utils.getMap(100);
        map.computeIfAbsent(101, num -> "val" + num);
        Assert.assertEquals(map.containsKey(101),true);

    }

    @Test
    public void  getOrDefaultTest(){

        Map<Integer, String> map = Utils.getMap(100);
        Assert.assertEquals(map.getOrDefault(101,"not found"),"not found");

    }

    @Test
    public void  mergeTest(){

        Map<Integer, String> map = Utils.getMap(100);
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        Assert.assertEquals(map.get(9),"val9val9");


    }

}