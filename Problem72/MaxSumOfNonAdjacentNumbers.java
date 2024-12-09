package Problem72;

import java.util.Arrays;

public class MaxSumOfNonAdjacentNumbers {

    public static int findMaxSumOfNonAdjacentNumbers(int[] elementArray) {
        int n = elementArray.length;

        if(n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        if(n==1)
            return elementArray[0];

        int inclusive = elementArray[0];
        int exclusive = 0;

        for(int i=1; i<n; i++) {
            int temp = inclusive;
            inclusive = Math.max(elementArray[i] + exclusive, inclusive);
            exclusive = temp;
        }

        return Math.max(inclusive, exclusive);
    }
    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 3, 8, 2, 4};

        System.out.println("Arithmetic Series is: ");
        System.out.println(Arrays.toString(arr));

        int result = findMaxSumOfNonAdjacentNumbers(arr);
        try {
            System.out.println("Maximum sum of non adjacent elements in above array is: " +result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
