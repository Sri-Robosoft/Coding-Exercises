package Problem17;

import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbersClass prime = new PrimeNumbersClass();

        int a = 1;
        int b = 100;
        List<Integer> primeList = prime.generatePrimeNumbers(a,b);

        for(Integer primeNum: primeList) {
            if(primeNum == 1001)
                System.out.println("Please enter positive numbers");
            else {
                System.out.print(primeNum +" ");
            }
        }
    }
}
