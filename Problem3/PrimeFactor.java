package Problem3;

import java.util.*;

public class PrimeFactor {
    public static void main(String[] args) {
        PrimeFactorClass prime = new PrimeFactorClass();

        List<Integer> primeList = prime.getPrimeFactors(24);

        for(Integer i: primeList)
            if(i==1001)
                System.out.println("No Prime Factors!!");
            else
                System.out.print(i +" ");
    }
}
