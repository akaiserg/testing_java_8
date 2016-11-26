package org.project.j8.example.parallelStream;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TimeTest {


    public static  void  main(String args[]){

        List<String> values = Utils.getRandomList(500000);
        System.out.println(String.format("sequential sort took: %d ms", sequentialSort(values)));
        System.out.println(String.format("parallel sort took: %d ms", parallelSort(values)));

    }


    private  static  long parallelSort(List<String> values){

        long t0 = System.nanoTime();
        long count = values.stream().sorted().count();
        long t1 = System.nanoTime();
        return TimeUnit.NANOSECONDS.toMillis(t1 - t0);

    }

    private  static  long sequentialSort(List<String> values){

        long t0 = System.nanoTime();
        long count = values.parallelStream().sorted().count();
        long t1 = System.nanoTime();
        return TimeUnit.NANOSECONDS.toMillis(t1 - t0);

    }

}
