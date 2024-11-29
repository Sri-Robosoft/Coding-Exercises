package Problem15;

class ReverseNumber {
    private int rem;
    private int rev;

    ReverseNumber() {
        this.rem = 0;
        this.rev = 0;
    }

    public int reverseGivenNumber(int n) {
        if(n<10) {
            return 1001;
        }

        while(n!=0) {
            rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        return rev;
    }
}

