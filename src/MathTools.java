import java.util.function.DoubleUnaryOperator;
import java.util.function.DoubleUnaryOperator;

/**
 * Created by meni on 03/08/15.
 */
public class MathTools {

    /**
     * Approximates the definite integral using Simpson's Rule.  The function
     * should be continuous in the range [a, b].  The specified number of
     * subintervals should be even, but the value is incremented if it isn't.
     *
     * @param duo the function to be integrated
     * @param a  the lower bound of integration
     * @param b  the upper bound of integration
     * @param n  the number of subintervals to be used in computing the integral
     *
     * @return the value of the definite integral
     *
     * @throws IllegalA rgumentException if n < 0, n > 100,000, or b < a
     */
    public static double integrate(DoubleUnaryOperator duo, double a, double b, int n)
    {
        if (n < 0 || n > 100_000)
        {
            String message = n + "out of range";
            throw new IllegalArgumentException(message);
        }
        else if (b < a)
        {
            String message = "a must be less than b; a =" + a + ", b = " + b;
            throw new IllegalArgumentException(message);
        }

        if (a == b)
            return 0;

        double x, deltaX, sum2 = 0.0, sum4;

        if (n % 2 != 0)   // make sure that n is even
            ++n;

        deltaX = (b - a)/n;
        x = a + deltaX;
        sum4 = duo.applyAsDouble(x);

        for (int i = 1; i <= (n - 2)/2; ++i)
        {
            x = x + deltaX;
            sum2 = sum2 + duo.applyAsDouble(x);
            x = x + deltaX;
            sum4 = sum4 + duo.applyAsDouble(x);
        }

        return (deltaX/3.0)*(duo.applyAsDouble(a) + duo.applyAsDouble(b) + 4.0*sum4 + 2.0*sum2);
    }
}
