package Problem81;

public class SumOfDiagonalElements {

    public static int findSumOfDiagonalElementsInMatrix(int[][] elementArray) {
        int n = elementArray.length;
        int sum = 0;

        if (n == 0) 
            throw new IllegalArgumentException("Array cannot be empty");

        for(int i=0; i<n; i++) {
            sum += elementArray[i][i];
            if(i!=n-1-i)
                sum += elementArray[i][n-1-i];
        }

        return sum;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    
        System.out.println("Matrix is: ");
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        try {
            System.out.println("Sum of diagonal elements in matrix is: " +findSumOfDiagonalElementsInMatrix(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}