package eu.kunas.javalistmapset.performances;

import java.util.*;

/**
 * Created by Kunas on 09.06.2015.
 */
public class TreeMapSpeedPerformance {

    public static void addSomeString(String someText, Integer times) {
        Map<String, String> list = new TreeMap<String, String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.put(i + "", someText);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis TreeMap for add of some String");

    }

    public static void removeNext(String someText, Integer times) {
        TreeMap<String, String> list = new TreeMap<String, String>();

        for (int i = 0; i < times; i++) {
            list.put("" + i, someText);
        }

        long start = System.currentTimeMillis();


        Boolean next = true;
        Map<String, String> temp = new HashMap<String, String>();

        for (Map.Entry<String,String> e : list.entrySet()) {
            if (next) {
                next = false;
                temp.put(e.getKey(),e.getValue());
            } else {
                next = true;
            }
        }

        for (Map.Entry<String,String> e : temp.entrySet()) {
            list.remove(e.getKey());
        }

        long stop = System.currentTimeMillis();
        System.out.println(stop - start + " Millis TreeMap remove next");

    }

}
