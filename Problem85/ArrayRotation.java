package Problem85;

import java.util.Arrays;

public class ArrayRotation {

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static int[] rotateArray(int[] elementArray, int K) {
        int n = elementArray.length;

        if(n==0)
            throw new IllegalArgumentException("Array cannot be empty");

        K = K >= n ? K % n : K;

        if (K==0 || n==1)
            return elementArray;

        reverse(elementArray, 0, n - 1);
        reverse(elementArray, 0, K - 1);
        reverse(elementArray, K, n - 1);
        return elementArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int K = 4;

        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(arr));
        try {
            int[] rotatedArray = rotateArray(arr, K);
            System.out.println("Array after " + K + " circular rotations: " + Arrays.toString(rotatedArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

