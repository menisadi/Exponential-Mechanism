import javafx.print.Collation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * Created by meni on 03/08/15.
 */

public class Tests {

    @Test
    public void testMeanQUality() {
        System.out.println("testing qualit function for mean aproximation");
        ArrayList<Double> testArray = new ArrayList<Double>();
        testArray.add(0.97);testArray.add(0.15); testArray.add(0.71); testArray.add(0.22);
        testArray.add(0.8); testArray.add(0.17); testArray.add(0.34);
        Double testCase = new Double(0.15);
        System.out.println("Arra: " + testArray.toString());
        System.out.println("test case: " + testCase);

        Collections.sort(testArray);
        int less = Collections.binarySearch(testArray, testCase);
        int more = testArray.size() - less;
        if (testArray.contains(testCase)) {
            less++;

        }
        else {
            less = less * (-1) - 1;
        }
        int quality = Math.abs(more - less);
        assertEquals(4, less);
    }

}
