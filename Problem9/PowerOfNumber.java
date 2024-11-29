package Problem9;

class PowerOfNumber {

    public int calculatePowerOfNumber(int base, int exp) {
        if(exp<0)
            return 1001;

        if(exp==0)
            return 1;

        return base * calculatePowerOfNumber(base, exp-1);
    }
}