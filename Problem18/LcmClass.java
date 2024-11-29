package Problem18;

public class LcmClass {

    public int calculateGcd(int a, int b) {
        int gcdValue = 0;
        for(int i=Math.min(a,b); i>0; i--) {
            if(a%i==0 && b%i==0) {
                gcdValue = i;
                break;
            }
        }
        return gcdValue;
    }

    public int calculateLcm(int a, int b) {
        if(a<1||b<1) {
            return 1001;
        }
        return (a*b)/calculateGcd(a,b);
    }
}
