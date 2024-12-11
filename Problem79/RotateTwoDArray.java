package Problem79;

public class RotateTwoDArray {

    public static int[][] rotateTwoDArray(int[][] elementArray, int row, int col) {
        int n = elementArray.length;

        for(int i=0; i<row; i++) {
            for(int j=i; j<col; j++) {
                int temp = elementArray[i][j];
                elementArray[i][j] = elementArray[j][i];
                elementArray[j][i] = temp;
            }
        }
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col/2; j++) {
                int temp = elementArray[i][j];
                elementArray[i][j] = elementArray[i][col-1-j];
                elementArray[i][col-1-j] = temp;
            }
        }

        return elementArray;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 2}, {4, 5, 6, 5}, {7, 8, 9, 8}, { 4, 8, 7, 6}};
        int row = arr.length;
        int col = arr[0].length;
    
        System.out.println("2D array is: ");
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        try {
            System.out.println("After rotating 2D array: ");
            int[][] matrix = rotateTwoDArray(arr, row, col);
            for (int i=0; i<row; i++) {
                for (int j=0; j<col; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
