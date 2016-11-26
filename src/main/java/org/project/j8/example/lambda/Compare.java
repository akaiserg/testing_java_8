package org.project.j8.example.lambda;


import java.util.ArrayList;

import static java.util.Collections.sort;

public class Compare  {

    public ArrayList<String> compareLamba(ArrayList<String> list){

        sort(list,(String a, String b)->
            {
                return a.compareTo(b);
            }
        );
        return list;
    }

    public ArrayList<String> compareOld(ArrayList<String> list){

        sort(list);
        return list;

    }


}
