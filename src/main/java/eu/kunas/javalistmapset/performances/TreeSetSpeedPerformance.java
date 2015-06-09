package eu.kunas.javalistmapset.performances;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Kunas on 09.06.2015.
 */
public class TreeSetSpeedPerformance {

    public static void addSomeString(String someText, Integer times) {
        Set<String> list = new TreeSet<String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.add(someText + " " + i);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis TreeSet for add of some String");

    }
}
