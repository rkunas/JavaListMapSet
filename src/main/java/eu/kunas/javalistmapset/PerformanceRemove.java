package eu.kunas.javalistmapset;

import eu.kunas.javalistmapset.performances.ArrayListSpeedPerformance;
import eu.kunas.javalistmapset.performances.LinkedListSpeedPerformance;
import eu.kunas.javalistmapset.performances.VectorSpeedPerformance;

/**
 * Created by Kunas on 08.06.2015.
 */
public class PerformanceRemove {

    private static final Integer times = 500000;

    public static void main(String[] args) {
        ArrayListSpeedPerformance.removeNext("Some text", times);
        LinkedListSpeedPerformance.removeNext("Some text", times);
        VectorSpeedPerformance.removeNext("Some text", times);
    }
}
