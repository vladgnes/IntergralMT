import java.util.function.DoubleFunction;

/**
 * Created by vlad on 30.07.2016.
 */
public class OneSegmentCalculationThread extends Thread {
    int a,b,n,i;
    double var1,var2;
    double sum = 0;
    DoubleFunction<Double> doubleFunction = new DoubleFunction<Double>() {
        @Override
        public Double apply(double value) {
            return value;
        }
    };
    public OneSegmentCalculationThread(int a, int b,int n, int i){
        this.a = a;
        this.b = b;
        this.n = n;
        this.i = i;
        var1 = doubleFunction.apply(a + i);
        var2 =  doubleFunction.apply(a + i + 1);


        start();
    }

    public void run(){
        sum = (var1 + var2)/2 * (a+i+i - a+i);
    }
}
