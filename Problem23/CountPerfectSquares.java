package Problem23;

public class CountPerfectSquares {
    public static void main(String[] args) {
        PerfectSquaresBetweenTwoNumbers perfect = new PerfectSquaresBetweenTwoNumbers();

        int a = 1;
        int b = 100;
        int result = perfect.countOfPerfectSquares(a,b);
        if(result==1001)
            System.out.println("Enter positive integers");
        else
            System.out.println("Count of perfect squares between 1 and 100 is: " +result);
    }
}
