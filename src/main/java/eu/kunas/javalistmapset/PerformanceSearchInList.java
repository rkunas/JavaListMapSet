package eu.kunas.javalistmapset;

import eu.kunas.javalistmapset.performances.LambdaListSearchPerformance;

/**
 * Created by RKU on 23.02.2016.
 */
public class PerformanceSearchInList {
                                //
    private static final Integer times = 10000000;

    public static void main(String[] args) {
        LambdaListSearchPerformance.perfLambdas(times);
    }
}
