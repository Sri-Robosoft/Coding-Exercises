package Problem14;

import java.util.ArrayList;
import java.util.List;

class FibonacciSeries {
    private int a;
    private int b;
    private int c;
    private List<Integer> fibonacciList;

    FibonacciSeries() {
        this.a = 0;
        this.b = 1;
        this.c = 0;
        this.fibonacciList = new ArrayList<>();
    }

    public List<Integer> generateFibonacciSeries(int n) {
        if(n<=0) {
            this.fibonacciList.add(1001);
            return this.fibonacciList;
        }
        if(n==1) {
            this.fibonacciList.add(a);
            return this.fibonacciList;
        }

        this.fibonacciList.add(a);
        this.fibonacciList.add(b);

        for(int i=3; i<=n; i++) {
            c = a+b;
            this.fibonacciList.add(c);
            a = b;
            b = c;
        }
        return this.fibonacciList;
    }
}


