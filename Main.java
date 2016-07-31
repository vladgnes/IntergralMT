import java.util.Scanner;

/**
 * Created by vlad on 29.07.2016.
 */

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0;i < n-1;i++){
            OneSegmentCalculationThread oneSegmentCalculationThread = new OneSegmentCalculationThread(a,b,n,i);//(doubleFunction.apply(a + i) + doubleFunction.apply(a + i + 1))/2 * (a+i+i - a+i);
        }
    }
}
