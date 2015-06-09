package eu.kunas.javalistmapset;

import eu.kunas.javalistmapset.performances.*;

/**
 * Created by Kunas on 08.06.2015.
 */
public class PerformanceAddString {

    private static final Integer times = 5000000;

    public static void main(String[] args) {

        ArrayListSpeedPerformance.addSomeString("Some String", times);
        LinkedListSpeedPerformance.addSomeString("Some String", times);
        VectorSpeedPerformance.addSomeString("Some String", times);

        HashSetSpeedPerformance.addSomeString("Some String", times);
        LinkedHashSetSpeedPerformance.addSomeString("Some String", times);
        TreeSetSpeedPerformance.addSomeString("Some String", times);

        HashMapSpeedPerformance.addSomeString("Some String",times);
        LinkedHashMapSpeedPerformance.addSomeString("Some String", times);
        HashTableSpeedPerformance.addSomeString("Some String", times);
        TreeMapSpeedPerformance.addSomeString("Some String", times);
    }
}
