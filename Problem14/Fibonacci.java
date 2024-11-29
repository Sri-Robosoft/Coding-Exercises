package Problem14;

import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        FibonacciSeries fibonacci = new FibonacciSeries();
        int n=8;
        List<Integer> fibonacciList = fibonacci.generateFibonacciSeries(n);
        for(Integer fib : fibonacciList) {
            if(fib == 1001)
                System.out.println("Error: Enter a positive number greater than 0");
            else
                System.out.print(fib + " ");
        }
    }
}
