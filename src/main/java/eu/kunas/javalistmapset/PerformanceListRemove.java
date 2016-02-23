package eu.kunas.javalistmapset;

import eu.kunas.javalistmapset.performances.*;

/**
 * Created by Kunas on 08.06.2015.
 */
public class PerformanceListRemove {

    private static final Integer times = 500000;

    public static void main(String[] args) {
        ArrayListSpeedPerformance.removeNext("Some text", times);
        LinkedListSpeedPerformance.removeNext("Some text", times);
        VectorSpeedPerformance.removeNext("Some text", times);

        HashSetSpeedPerformance.removeNext("Some text", times);
        LinkedHashSetSpeedPerformance.removeNext("Some text", times);
        TreeSetSpeedPerformance.removeNext("Some text", times);

        HashMapSpeedPerformance.removeNext("Some String", times);
        LinkedHashMapSpeedPerformance.removeNext("Some String", times);
        HashTableSpeedPerformance.removeNext("Some String", times);
        TreeMapSpeedPerformance.removeNext("Some String", times);
    }


}
