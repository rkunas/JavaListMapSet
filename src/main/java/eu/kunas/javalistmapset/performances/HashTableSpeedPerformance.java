package eu.kunas.javalistmapset.performances;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Kunas on 09.06.2015.
 */
public class HashTableSpeedPerformance {

    public static void addSomeString(String someText, Integer times) {
        Map<String, String> list = new Hashtable<String, String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.put(i + "", someText);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis HashTable for add of some String");

    }
}
