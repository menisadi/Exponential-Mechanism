/**
 * Created by meni on 02/08/15.
 */
import java.util.function.DoubleBinaryOperator;

public class Lambda {
    public static double foo(DoubleBinaryOperator oper) {
        return oper.applyAsDouble(5,10);
    }

    public static void main(String[] args) {
        System.out.println(foo((x, y) -> x+y));
    }
}
