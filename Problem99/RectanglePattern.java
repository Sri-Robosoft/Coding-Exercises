package Problem99;

public class RectanglePattern {

    public static void printPattern(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows = 5;
        int columns = 9;
        printPattern(rows, columns);
    }
}
