package Problem8;

public class NaturalNumberSum {
    public static void main(String[] args) {
        SumRecursionClass recur = new SumRecursionClass();

        int result = recur.generateSumOfNaturalNumbers(5);
        if(result == 1001) {
            System.out.println("Error: Entered number is not  natural number");
        } else {
            System.out.println("Sum up-to given natural number is: " +result);
        }
    }
}
