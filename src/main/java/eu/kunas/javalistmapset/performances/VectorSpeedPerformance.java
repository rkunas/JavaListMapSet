package eu.kunas.javalistmapset.performances;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Created by Kunas on 08.06.2015.
 */
public class VectorSpeedPerformance {

    public static void addSomeString(String someText, Integer times) {
        Vector<String> list = new Vector<String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.add(someText);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis Vector for add of some String");

    }

}
