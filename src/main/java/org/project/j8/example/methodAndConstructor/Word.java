package org.project.j8.example.methodAndConstructor;


public class Word {

    static private int val=10;

    String startWith(String word){

        return String.valueOf(word.charAt(0));
    }

    String getValueUpper(String valueToSet){

        IsimpleValue<String>   theValue = (value)->{
            return value.toUpperCase();
        };
        return theValue.getValue(valueToSet);

    }

}
