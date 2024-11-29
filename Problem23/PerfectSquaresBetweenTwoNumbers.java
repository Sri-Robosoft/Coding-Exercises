package Problem23;

public class PerfectSquaresBetweenTwoNumbers {
    private int count = 0;

    public int countOfPerfectSquares(int a, int b) {
        if(a<0 || b<0)
            return 1001;

        for(int i=a+1; i<b; i++) {
            int squareRoot = (int) Math.sqrt(i);
            if((squareRoot*squareRoot) == i)
                count++;
        }
        return count;
    }
}
