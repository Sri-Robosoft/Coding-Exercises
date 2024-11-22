package Problem5;

public class RootsQuadraticEquation {
    private double determinant;
    private double firstRoot;
    private double secondRoot;
    private double real;
    private double imaginary;

    public void findRootsOfQuadraticEquation(int a, int b, int c) {
        determinant = (b*b) - (4*a*c);

        if(determinant > 0) {
            firstRoot = (-b + Math.sqrt(determinant))/(2*a);
            secondRoot = (-b - Math.sqrt(determinant))/(2*a);
            System.out.println("Roots are real and different");
            System.out.println("First Root: " +firstRoot);
            System.out.println("Second Root: " +secondRoot);
        } else if(determinant == 0) {
            firstRoot = secondRoot = (double) -b /(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("First Root: " +firstRoot);
            System.out.println("Second Root: " +secondRoot);
        } else {
            real = (double) -b /(2*a);
            imaginary = Math.sqrt(-determinant)/(2*a);
            System.out.println("Roots are complex and different");
            System.out.printf("First Root = %.2f + %.2fi \n", real, imaginary);
            System.out.printf("Second Root = %.2f - %.2fi", real, imaginary);
        }
    }
}
