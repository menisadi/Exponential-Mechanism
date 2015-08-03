/**
 * Created by meni on 03/08/15.
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;



public class Tests {

    @Test
    public void testMeanQuality() {
        System.out.println("testing quality function for mean approximation");

        ArrayList<Double> testArray = new ArrayList<>();
        testArray.add(0.97);testArray.add(0.15); testArray.add(0.71); testArray.add(0.22);
        testArray.add(0.8); testArray.add(0.17); testArray.add(0.34);
        Double testCase = 0.3;

        Collections.sort(testArray);

        System.out.println("Array: " + testArray.toString());
        System.out.println("test case: " + testCase);

        int less = Collections.binarySearch(testArray, testCase);
        int more = testArray.size() - less;
        if (testArray.contains(testCase)) {
            less++;
        }
        else {
            less = less * (-1) - 1;
            more = testArray.size() - less;
        }
        int quality = Math.abs(more - less);
        assertEquals(1, quality);
    }

    @Test
    public void testIntegration() {
        System.out.println("\ntesting integration function");
        System.out.println("function:" + "abs");
        System.out.println("interval: ["+(-1)+","+1+"]");
        System.out.println("no. of sub-intervals: " + 50);
        double result = MathTools.integrate(Math::abs, -1, 1, 50);
        assertEquals(1, result, 0.001);
    }
}
