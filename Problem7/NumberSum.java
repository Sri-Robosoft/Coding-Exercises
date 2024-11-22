package Problem7;

public class NumberSum {
    public static void main(String[] args) {
        SumClass sum = new SumClass();
        int result = sum.generateSumOfDigitsNumbers(139);
        if(result == 1001) {
            System.out.println("Error: Please enter number greater than 0");
        } else {
            System.out.println("Sum of digits in given number is: " +result);
        }
    }
}
