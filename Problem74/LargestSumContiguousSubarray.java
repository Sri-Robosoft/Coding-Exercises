package Problem74;

import java.util.*;

public class LargestSumContiguousSubarray {

    public static int[] findLargestSumContiguousSubArray(int[] elementArray) {
        int n = elementArray.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0, start = 0, end = 0, tempStart = 0;

        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        for (int i=0; i<n; i++) {
            sum += elementArray[i]; 
            if(sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i+1;
            }
        }

        return Arrays.copyOfRange(elementArray, start, end + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, -3, -4};
        
        System.out.println("Array Elements: ");
        System.out.println(Arrays.toString(arr));

        try {
            System.out.println("Largest sum contiguous subarray: " + Arrays.toString(findLargestSumContiguousSubArray(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}