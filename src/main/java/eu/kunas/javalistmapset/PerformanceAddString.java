package eu.kunas.javalistmapset;

import eu.kunas.javalistmapset.performances.ArrayListSpeedPerformance;
import eu.kunas.javalistmapset.performances.LinkedListSpeedPerformance;
import eu.kunas.javalistmapset.performances.VectorSpeedPerformance;

/**
 * Created by Kunas on 08.06.2015.
 */
public class PerformanceAddString {

    private static final Integer times = 50000000;

    public static void main(String[] args) {

        ArrayListSpeedPerformance.addSomeString("Some String", times);
        LinkedListSpeedPerformance.addSomeString("Some String", times);
        VectorSpeedPerformance.addSomeString("Some String", times);
    }
}
