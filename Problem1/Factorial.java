package Problem1;

public class Factorial {
    public static void main(String[] args) {
        GenerateFactorial factorial = new GenerateFactorial();
        System.out.println("Factorial of 0 is: " + factorial.getFactorial(0));
        System.out.println("Factorial of 1 is: " + factorial.getFactorial(1));
        System.out.println("Factorial of 4 is: " + factorial.getFactorial(4));
        System.out.println("Factorial of 6 is: " + factorial.getFactorial(6));
    }
}
