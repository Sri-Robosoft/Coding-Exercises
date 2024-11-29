package Problem19;

public class SquareNumberClass {
    private int n;

    public int checkNumberIsSquare(int num) {
        if(num<0)
            return 1001;
        n = (int) Math.sqrt(num);
        if((n*n)==num) {
            return 1;
        }
        return 0;
    }
}
