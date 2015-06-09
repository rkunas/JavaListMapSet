package eu.kunas.javalistmapset.performances;

import java.util.*;

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

    public static void removeNext(String someText, Integer times) {
        Set<String> list = new TreeSet<String>();

        for (int i = 0; i < times; i++) {
            list.add(someText + " " + i);
        }

        long start = System.currentTimeMillis();

        Iterator<String> iterator = list.iterator();

        Boolean next = true;

        while(iterator.hasNext()){
            iterator.next();
            if(next){
                next = false;
                iterator.remove();
            }else{
                next = true;
            }
        }

        long stop = System.currentTimeMillis();
        System.out.println(stop - start + " Millis TreeSet remove next");

    }
}
