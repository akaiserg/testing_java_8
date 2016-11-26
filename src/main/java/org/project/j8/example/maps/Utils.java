package org.project.j8.example.maps;

import java.util.HashMap;
import java.util.Map;

public class Utils {

    static public Map<Integer, String> getMap(int amount){

        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < amount; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        return map;

    }

}
