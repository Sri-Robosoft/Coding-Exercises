package Problem3;

import java.util.*;

public class PrimeFactorClass {
    List<Integer> primeList;

    PrimeFactorClass() {
        this.primeList = new ArrayList<>();
    }

    public List<Integer> getPrimeFactors(int n) {
        if(n==0 || n==1) {
            this.primeList.add(1001);
            return this.primeList;
        }
        for(int i=2; i<=n; i++) {
            while(n%i==0) {
                this.primeList.add(i);
                n=n/i;
            }
        }
        return this.primeList;
    }
}
