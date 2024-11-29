package Problem24;

public class SumOfNFibonacciSeries {
    private int sum=0;
    private int a,b,c;

    SumOfNFibonacciSeries() {
         this.sum = 0;
         this.a = 0;
         this.b = 1;
         this.c = 0;
     }

    public int sumOfFibonacciSeries(int n, String val) {
        if(n<0)
            return 1001;

        if(val.equalsIgnoreCase("even"))
            sum += a;
        else if(val.equalsIgnoreCase("odd"))
            sum += b;

        for(int i=2; i<(n*2); i++) {
            c = a + b;
            a = b;
            b = c;
            if(i%2==0 && val.equalsIgnoreCase("even")) {
                sum += c;
            }
            else if((i+1)%2==0 && val.equalsIgnoreCase("odd"))
                sum += c;
        }
        return sum;
    }
}
