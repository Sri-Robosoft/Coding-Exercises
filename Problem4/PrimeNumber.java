package Problem4;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumberClass prime = new PrimeNumberClass();
        int n=10;

        List<Integer> primeList = prime.getNPrimeNumbers(n);
        System.out.print("Prime number up-to " +n+ " : ");
        for(Integer i: primeList)
            if(i==1001)
                System.out.println("No Prime Factors!!");
            else
                System.out.print(i +" ");
    }
}
