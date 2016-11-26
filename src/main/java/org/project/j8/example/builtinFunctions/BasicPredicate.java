package org.project.j8.example.builtinFunctions;


import java.util.function.Predicate;

public class BasicPredicate {

    public boolean  isEmpty(String value){

        Predicate<String> predicate = (string) -> string.length() > 0;
        return predicate.test(value);

    }

    public boolean  hasMoreLetterThan(String value,int numberOfLetters){

        Predicate<String> predicate = (s) -> { return s.length() > numberOfLetters; };
        return predicate.test(value);

    }
}
