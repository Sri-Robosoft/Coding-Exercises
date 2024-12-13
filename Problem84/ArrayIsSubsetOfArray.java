package Problem84;

import java.util.*;

public class ArrayIsSubsetOfArray {

    public static boolean isArraySubsetOfAnotherArray(int[] elementArray, int[] arr) {
        int n = elementArray.length;
        Set<Integer> arraySet = new HashSet<>();

        if (n == 0) 
            throw new IllegalArgumentException("Array cannot be empty");
        
        for (int elem : elementArray) 
            arraySet.add(elem);

        if (arr.length == 0) {
            return true;
        }

        for (int elem : arr) {
            if (!arraySet.contains(elem)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 5, 7};
        int[] arr2 = {5, 7};

        System.out.println("Array elements are: " + Arrays.toString(arr1));

        try {
            boolean isSubset = isArraySubsetOfAnotherArray(arr1, arr2);
            if(isSubset)
                System.out.println(Arrays.toString(arr2) + " is subset of " + Arrays.toString(arr1));
            else
                System.out.println(Arrays.toString(arr2) + " is not subset of " + Arrays.toString(arr1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}