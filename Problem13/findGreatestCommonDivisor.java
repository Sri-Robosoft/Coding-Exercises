package Problem13;

class GCDCheck {

    public int findGreatestCommonDivisor(int a, int b) {
        if(a<=0 || b<=0)
            return 1001;

        for(int i = Math.min(a, b); i>0; i--) {
            if(a%i==0 && b%i==0)
                return i;
        }
        return 0;
    }
}

