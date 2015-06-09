package eu.kunas.javalistmapset.performances;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Kunas on 09.06.2015.
 */
public class HashSetSpeedPerformance {

    public static void addSomeString(String someText, Integer times) {
        Set<String> list = new HashSet<String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.add(someText + " " + i);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis HashSet for add of some String");

    }
}
