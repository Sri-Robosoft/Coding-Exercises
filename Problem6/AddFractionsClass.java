package Problem6;

import java.util.*;

public class AddFractionsClass {
    private int numerator;
    private int denominator;
    private int gcdValue;
    private List<Integer> fractionList;

    AddFractionsClass() {
        this.numerator = 0;
        this.denominator = 0;
        this.gcdValue = 0;
        this.fractionList = new ArrayList<>();
    }

    public void simpleFraction(int num, int den) {
        for(int i=Math.min(num, den); i>0; i--) {
            if(num%i==0 && den%i==0) {
                this.gcdValue = i;
                break;
            }
        }
        fractionList.add(num/gcdValue);
        fractionList.add(den/gcdValue);
    }

    public List<Integer> addFractions(int num1, int den1, int num2, int den2) {
        if(den1==den2) {
            numerator = num1+num2;
            denominator = den1;
        } else {
            numerator = (num1*den2) + (num2*den1);
            denominator = den1 * den2;
        }
        simpleFraction(numerator, denominator);
        return this.fractionList;
    }
}
