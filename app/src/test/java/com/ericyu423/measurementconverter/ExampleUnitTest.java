package com.ericyu423.measurementconverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testmeterToInch()throws Exception{

            MainActivity ma = new MainActivity();

            Double result = ma.meterToInch(2.0);
            Double actual = 2*3.28084;
            assertEquals(result,actual);

    }



}