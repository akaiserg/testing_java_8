package org.project.j8.example.parallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Utils {

    static public List<String> getRandomList(int amount){

        List<String> values = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        return values;

    }
}
