package eu.kunas.javalistmapset;

import eu.kunas.javalistmapset.performances.*;

/**
 * Created by Kunas on 08.06.2015.
 */
public class PerformanceRemove {

    private static final Integer times = 500000;

    public static void main(String[] args) {
        ArrayListSpeedPerformance.removeNext("Some text", times);
        LinkedListSpeedPerformance.removeNext("Some text", times);
        VectorSpeedPerformance.removeNext("Some text", times);

        HashSetSpeedPerformance.removeNext("Some text", times);
        LinkedHashSetSpeedPerformance.removeNext("Some text", times);
        TreeSetSpeedPerformance.removeNext("Some text", times);
    }


}
