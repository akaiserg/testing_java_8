package org.project.j8.example.builtinFunctions;


import java.util.function.Function;

public class BasicFunction {


    public String toStringAgain(String s){

        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        return backToString.apply(s);

    }

}


