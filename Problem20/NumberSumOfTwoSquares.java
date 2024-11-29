package Problem20;

public class NumberSumOfTwoSquares {
    private int result;

    public boolean checkNumberSumOfTwoSquares(int sum) {
        for(int i=1; i<= sum; i++) {
            for(int j=1; j<=sum; j++) {
                result = (i*i) + (j*j);
                if(sum == result)
                    return true;
            }
        }
        return false;
    }
}
