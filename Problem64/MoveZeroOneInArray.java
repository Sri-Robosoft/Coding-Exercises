package Problem64;

import java.util.Arrays;

public class MoveZeroOneInArray {

    public static int[] moveZeroOneInArray(int[] elementArray) {
        int n = elementArray.length;
        int[] zeroOneArray = new int[n];
        int j = 0;
        int k = n-1;

        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        for(int i=0; i<n; i++) {
            if(elementArray[i] == 0) {
                zeroOneArray[j] = elementArray[i];
                j++;
            } else if(elementArray[i] == 1) {
                zeroOneArray[k] = elementArray[i];
                k--;
            } else {
                throw new IllegalArgumentException("Array can only contain 0s and 1s.");
            }
        }

        return zeroOneArray;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 0 , 1};
        // int[] arr = { };

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));
        try {
            System.out.println("Array after moving 0's and 1's to a particular position: ");
            System.out.println(Arrays.toString(moveZeroOneInArray(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
