package org.project.j8.example.builtinFunctions;


import java.util.function.Function;

public class Utils {
    public static Function<Integer, Integer> adder(Integer x) {
        return y -> x + y;
    }
}