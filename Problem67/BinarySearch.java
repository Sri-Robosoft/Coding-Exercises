package Problem67;

import java.util.Arrays;

public class BinarySearch {

    public static int findNumberUsingBinarySearch(int[] elementArray, int val, int beg, int end) {
        if (elementArray.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        if(beg<=end) {
            int mid = (beg+end) / 2;
            if(elementArray[mid] == val)
                return mid;
            else if(elementArray[mid] < val)
                return findNumberUsingBinarySearch(elementArray, val, mid+1, end);
            else if(elementArray[mid] > val)
            return findNumberUsingBinarySearch(elementArray, val, beg, mid-1);
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {19, 15, 3, 23, 7};
        int value = 15;

        Arrays.sort(arr);
        System.out.println("Array Elements are: ");
        System.out.println(Arrays.toString(arr));

        int result = findNumberUsingBinarySearch(arr, value, 0, arr.length-1);
        try {
            if(result == -1)
                System.out.println("Element is not found in array");
            else
                System.out.println("Element is found in array at index: " +result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
