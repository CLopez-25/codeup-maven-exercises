import org.apache.commons.math3.util.Precision;

public class MathOperations {
    public static long add(long input1, long input2){
        return input1 + input2;
    }

    public static double tip(double bill, double tip){
        return Precision.round(bill * (tip / 100), 2);
    }
}
