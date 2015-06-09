package eu.kunas.javalistmapset.performances;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Kunas on 09.06.2015.
 */
public class LinkedHashMapSpeedPerformance {

    public static void addSomeString(String someText, Integer times) {
        Map<String, String> list = new LinkedHashMap<String, String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.put(i + "", someText);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis LinkedHashMap for add of some String");

    }
}
