package Problem75;

import java.util.*;

public class ContiguousSubarraySumEqualToNumber {

    public static int calculateSum(List<Integer> arr) {
        int sum = 0;
        for(Integer elem : arr)
            sum += elem;
        return sum;
    }

    public static List<List<Integer>> findContiguousSubArraySumEqualToNumber(int[] elementArray, int num) {
        int n = elementArray.length;
        List<List<Integer>> subArrayList = new ArrayList<>();

        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        for(int i=0; i<n; i++) {
            List<Integer> subArray = new ArrayList<>();
            for(int j=i; j<n; j++) {
                subArray.add(elementArray[j]);
                if(calculateSum(subArray) == num) {
                    subArrayList.add(subArray);
                    break;
                }
            }
        }
        return subArrayList;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int num = 5;
        
        System.out.println("Array Elements: ");
        System.out.println(Arrays.toString(arr));

        try {
            System.out.println("Largest sum contiguous subarray: ");
            for (List<Integer> subarray : findContiguousSubArraySumEqualToNumber(arr, num)) {
                System.out.println(subarray);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
