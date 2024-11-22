package Problem1;

public class GenerateFactorial {
    private int fact;

    GenerateFactorial() {
        this.fact = 0;
    }

    public int getFact() {
        return fact;
    }

    public int getFactorial(int n) {
        if(n == 0)
            return 1;
        fact = n * getFactorial(n-1);
        return getFact();
    }
}
