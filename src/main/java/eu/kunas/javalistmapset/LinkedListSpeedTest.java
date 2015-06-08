package eu.kunas.javalistmapset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kunas on 08.06.2015.
 */
public class LinkedListSpeedTest {

    public static void addSomeString(String someText, Integer times) {
        List<String> list = new LinkedList<String>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < times; i++) {
            list.add(someText);
        }

        long stop = System.currentTimeMillis();

        System.out.println(stop - start + " Millis for add of some String");

    }

}