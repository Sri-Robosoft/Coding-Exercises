package Problem8;

public class SumRecursionClass {

    public int generateSumOfNaturalNumbers(int n) {
        if(n<=0)
            return 1001;

        if(n<=1)
            return 1;
        else {
            return n + generateSumOfNaturalNumbers(n-1);
        }
    }
}
