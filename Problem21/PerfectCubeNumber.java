package Problem21;

public class PerfectCubeNumber {
    static int cubeRoot = 0;

    public static void checkPerfectCubeNumber(int n) {
        if(n<0)
            System.out.println("Enter a positive integer");

        cubeRoot = (int) Math.cbrt(n);

        if((cubeRoot*cubeRoot*cubeRoot) == n)
            System.out.println(n +" is a perfect cube number");
        else
            System.out.println(n +" is not a perfect cube number");
    }

    public static void main(String[] args) {
        int n = 15;
        checkPerfectCubeNumber(n);
    }
}
