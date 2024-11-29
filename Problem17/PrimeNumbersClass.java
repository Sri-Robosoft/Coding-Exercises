package Problem17;

import java.util.*;

public class PrimeNumbersClass {
    private boolean isPrime;
    private List<Integer> primeList;

    PrimeNumbersClass() {
        this.isPrime = false;
        this.primeList = new ArrayList<>();
    }

    public List<Integer> generatePrimeNumbers(int a, int b) {

        if(a<1||b<1) {
            this.primeList.add(1001);
            return this.primeList;
        }

        for(int i=a+1; i<b; i++) {
            isPrime = true;
            for(int j=2; j<=i/2; j++) {
                if(i%j==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                this.primeList.add(i);
        }
        return this.primeList;
    }


}
