package Problem22;

public class SumOfDigits {
    static int sum=0;
    static int rem=0;

    public static int sumOfDigitsOfNumber(int n) {
        if(n<0)
            return 1001;

        while(n!=0) {
            rem = n%10;
            sum = sum + rem;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 12345;
        int result = sumOfDigitsOfNumber(num);

        if(result==1001)
            System.out.println("Enter a positive number");
        else
            System.out.println("Sum of digits in " +num+ " is :" +result);
    }
}
