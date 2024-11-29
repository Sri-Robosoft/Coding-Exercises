package Problem9;

public class Power {
    public static void main(String[] args) {
        PowerOfNumber pow = new PowerOfNumber();

        int base = 3;
        int exp = 3;
        int powerResult = pow.calculatePowerOfNumber(base, exp);
        if(powerResult == 1001)
            System.out.println("Please enter exponent equal or greater than 0");
        else {
            System.out.println(base + " to the power " + exp + " is: " +powerResult);
        }
    }
}

