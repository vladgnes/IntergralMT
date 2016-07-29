import java.util.function.DoubleFunction;

/**
 * Created by vlad on 29.07.2016.
 */
public class IntegralSingleThreadProcessor {
    public static double integralCalculation(DoubleFunction<Double> doubleFunction, double a, double b, int n){
        double result = 0;
        for (int i = 0;i < n-1;i++){
            result += (doubleFunction.apply(a + i) + doubleFunction.apply(a + i + 1))/2 * (a+i+i - a+i);
        }
        return result;
    }
}
