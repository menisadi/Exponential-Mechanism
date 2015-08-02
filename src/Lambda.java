/**
 * Created by meni on 02/08/15.
 */
import java.util.Random;
import java.util.function.DoubleBinaryOperator;

public class Lambda {

    public static final int TIMES = 1000;

    public static double getNext() {
        Random randomGenerator = new Random();
        return  Math.log(1-randomGenerator.nextDouble())/(-2);
    }

    public static double foo(DoubleBinaryOperator oper) {
        return oper.applyAsDouble(5,10);
    }

    public static void main(String[] args) {
        System.out.println(foo((x, y) -> x+y));

        double sum = 0;

        for(int i = 1; i < TIMES; i++){
            sum += getNext();
        }
        double mean = sum / TIMES;

        System.out.print("the mean is: " + mean);
    }
}
