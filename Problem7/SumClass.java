package Problem7;

public class SumClass {
    private int sum;
    private int quotient;

    SumClass() {
        this.sum = 0;
        this.quotient = 0;
    }

    public int generateSumOfDigitsNumbers(int n) {
        if(n<=0)
            return 1001;
        while(n!=0) {
            quotient = n%10;
            sum += quotient;
            n /= 10;
        }
        return sum;
    }
}
