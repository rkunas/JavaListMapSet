package eu.kunas.javalistmapset;

import java.lang.reflect.Array;

/**
 * Created by Kunas on 08.06.2015.
 */
public class SpeedTest {

    private static final Integer times = 100000000;

    public static void main(String[] args) {

        ArrayListSpeedTest.addSomeString("Some String", times);
        LinkedListSpeedTest.addSomeString("Some String",times);

    }
}
