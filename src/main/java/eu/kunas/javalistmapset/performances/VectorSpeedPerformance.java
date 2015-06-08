package eu.kunas.javalistmapset.performances;

import java.util.*;

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

    public static void removeNext(String someText, Integer times) {
        Vector<String> list = new Vector<String>();

        for (int i = 0; i < times; i++) {
            list.add(someText);
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
        System.out.println(stop - start + " Millis Vector remove next");

    }

}
