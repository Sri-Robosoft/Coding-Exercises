package Problem4;

import java.util.*;

public class PrimeNumberClass {
    List<Integer> primeList;
    boolean isPrime;
    int counter;
    int n;

    PrimeNumberClass() {
        this.primeList = new ArrayList<>();
        this.counter = 0;
        this.n = 2;
    }

    public List<Integer> getNPrimeNumbers(int num) {
        if(n==0 || n==1) {
            this.primeList.add(1001);
            return this.primeList;
        }
        while(counter!=num) {
            isPrime = true;
            for(int i=2; i<=n/2; i++) {
                if(n%i==0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                this.primeList.add(n);
                counter++;
            }
            n++;
        }
        return this.primeList;
    }
}
