import java.util.ArrayList;
import java.util.function.DoubleUnaryOperator;

/**
 * Created by meni on 03/08/15.
 */
public interface QualityDoubleRange {
    public double qualify(ArrayList<Double> data, Double output);
}
