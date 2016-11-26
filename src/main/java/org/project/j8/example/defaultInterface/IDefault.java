package org.project.j8.example.defaultInterface;


public interface IDefault {

    public String concat(String s1, String s2);

    default int counter(String word){

        return word.length();

    }

}
