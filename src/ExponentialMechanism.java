/**
 * Created by meni on 02/08/15.
 */

import org.junit.Test;

import java.util.*;


public class ExponentialMechanism {

    /*
    public static double privateExpot(ArrayList<Double> dataSet, Set<Double> output, Quality q) {
        Random randomGenerator = new Random();
        double result;
               TODO
        return 0;

    }
    */

    public static double privateExpotToDouble(ArrayList<Double> dataSet, Quality q) {
        Random randomGenerator = new Random();

        double result;
                /* TODO */
        return 0;
    }

    public static void main(String[] args) {
        QualityDoubleRange meanQuality = (s, x) -> {
            Collections.sort(s);
            int less = Collections.binarySearch(s, x);
            int more = s.size() - less;
            if (s.contains(x)) {
                less++;
            }
            else {
                less = less * (-1) - 1;
                more = s.size() - less;
            }
            return Math.abs(more - less);
        };


    }
}
