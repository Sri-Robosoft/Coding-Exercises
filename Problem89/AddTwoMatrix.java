package Problem89;

public class AddTwoMatrix {

    public static int[][] addTwoMatrix(int[][] elementArray1, int[][] elementArray2) {
        int n1 = elementArray1.length;
        int n2 = elementArray1[0].length;
        int[][] resultArray = new int[n1][n2];

        if(elementArray1.length != elementArray2.length || elementArray1[0].length != elementArray2[0].length)
            throw new IllegalArgumentException("Matrices must have the same dimensions");

        for(int i=0; i<n1; i++) {
            for(int j=0; j<n2; j++) {
                resultArray[i][j] = elementArray1[i][j] + elementArray2[i][j];
            }
        }

        return resultArray;
    }
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
    
        System.out.println("Matrix 1 is: ");
        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr1[0].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2 is: ");
        for (int i=0; i<arr2.length; i++) {
            for (int j=0; j<arr2[0].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        try {
            System.out.println("Result of adding 2 matrix is: ");
            int[][] result = addTwoMatrix(arr1, arr2);
            for (int i=0; i<result.length; i++) {
                for (int j=0; j<result[0].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}