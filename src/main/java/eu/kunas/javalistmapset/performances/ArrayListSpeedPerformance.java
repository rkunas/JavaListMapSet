package eu.kunas.javalistmapset.performances;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kunas on 08.06.2015.
 */
public class ArrayListSpeedPerformance {

    public static void addSomeString(String someText, Integer times) {
        List<String> list = new ArrayList<String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.add(someText);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis ArrayList for add of some String");

    }

}
