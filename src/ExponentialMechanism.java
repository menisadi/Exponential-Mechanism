/**
 * Created by meni on 02/08/15.
 */

import java.util.*;
import java.util.function.DoubleUnaryOperator;


public class ExponentialMechanism {

    /*
    public static double privateExpot(ArrayList<Double> dataSet, Set<Double> output, Quality q) {
        Random randomGenerator = new Random();
        double result;
               TODO
        return 0;

    }
    */

    public static double privateExpotToDouble(ArrayList<Double> dataSet, QualityDoubleRange q, Double eps) {
        Random randomGenerator = new Random();

        DoubleUnaryOperator toIntegrate = (z) -> {
            return Math.exp(eps*q.qualify(dataSet,z));
        };
        Double normalizator = MathTools.integrate(toIntegrate,0,1,50);



        double result;
                /* TODO */
        return 0;
    }

    public static void main(String[] args) {
        QualityDoubleRange meanQuality = (Double s, Double x) -> {
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
            return (-1)*(Math.abs(more - less)/2);
        };


    }
}
