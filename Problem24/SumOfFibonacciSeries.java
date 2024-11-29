package Problem24;

public class SumOfFibonacciSeries {
    public static void main(String[] args) {
        SumOfNFibonacciSeries fibonacci = new SumOfNFibonacciSeries();

        int n = 3;
        String str = "even";
        int result = fibonacci.sumOfFibonacciSeries(n, str);

        if (result == 1001)
            System.out.println("Enter a positive number");
        else if (str.equalsIgnoreCase("even"))
            System.out.println("Sum of Fibonacci Series Numbers of First " + n + " Even Indexes is: " + result);
        else if (str.equalsIgnoreCase("odd"))
            System.out.println("Sum of Fibonacci Series Numbers of First " + n + " Odd Indexes is: " + result);
    }
}
