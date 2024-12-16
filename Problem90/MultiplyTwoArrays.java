package Problem90;

import java.util.Arrays;

public class MultiplyTwoArrays {

    public static int[] multiplyTwoArrays(int[] elementArray1, int[] elementArray2) {
        int n1 = elementArray1.length;
        int n2 = elementArray2.length;
 
        if (n1 != n2) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        int[] resultArray = new int[n1];

        for (int i=0; i<n1; i++) {
            resultArray[i] = elementArray1[i] * elementArray2[i];
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};

        System.out.println("Array 1: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Array 2: ");
        System.out.println(Arrays.toString(arr2));

        try {
            System.out.println("Result of multiplying corresponding elements:");
            System.out.println(Arrays.toString(multiplyTwoArrays(arr1, arr2)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
