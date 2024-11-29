package Problem13;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        GCDCheck gcd = new GCDCheck();

        int a=15;
        int b=20;
        int gcdValue = gcd.findGreatestCommonDivisor(a, b);

        if(gcdValue == 1000)
            System.out.println("Please enter numbers greater than 0");
        else if(gcdValue == 0)
            System.out.println("There is no Greatest Common Divisor between the 2 numbers");
        else
            System.out.println("Greatest Common Divisor between " +a+ " and " +b+ " is: " +gcdValue);
    }
}


