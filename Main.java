import java.util.function.DoubleFunction;

/**
 * Created by vlad on 29.07.2016.
 */

public class Main {
    public static void main(String [] args){
        DoubleFunction<Double> doubleFunction = new DoubleFunction<Double>() {
            @Override
            public Double apply(double value) {
                return value;
            }
        };
        IntegralSingleThreadProcessor.integralCalculation(doubleFunction,0,2,2);
    }
}
