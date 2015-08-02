/**
 * Created by meni on 02/08/15.
 */
import java.util.*;

public class ExponentialMechanism {

    public static final int TIMES = 1000;

    public static double getNext() {
        Random randomGenerator = new Random();
        return  Math.log(1-randomGenerator.nextDouble())/(-2);
    }

    public static double privateExpot(ArrayList<Double> dataSet, Set<Double> output, Quality q) {
        Random randomGenerator = new Random();
        double result;
    }

    public static void main(String[] args) {
        double sum = 0;

        for(int i = 1; i < TIMES; i++){
            sum += getNext();
        }
        double mean = sum / TIMES;

        Quality meanQualit = (S,x) -> {
            
        };

        System.out.print("the mean is: " + mean);
    }
}
