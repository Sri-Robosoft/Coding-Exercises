package Problem73;

import java.util.*;

public class PermutationsOfArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void findAllPermutations(int[] elementArray, int l, int r, List<int[]> permutationsList) {
        int n = elementArray.length;

        if(n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        if (l == r) {
            int[] permuteArray = new int[n];
            for(int i=0; i<n; i++)
                permuteArray[i] = elementArray[i];
            permutationsList.add(permuteArray);
        } else {
            for (int i = l; i <= r; i++) {
                swap(elementArray, l, i);
                findAllPermutations(elementArray, l + 1, r, permutationsList);
                swap(elementArray, l, i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(arr));

        List<int[]> result = new ArrayList<>();
        findAllPermutations(arr, 0, arr.length-1, result);
        try {
            System.out.println("All possible permutations of above array");
            for(int[] permutation : result)
                System.out.println(Arrays.toString(permutation));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
