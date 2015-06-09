package eu.kunas.javalistmapset.performances;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kunas on 09.06.2015.
 */
public class HashMapSpeedPerformance {

    public static void addSomeString(String someText, Integer times) {
        Map<String, String> list = new HashMap<String, String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.put(i + "", someText);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis HashMap for add of some String");

    }
}
