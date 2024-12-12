package Problem83;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] mergeTwoSortedArrays(int[] elementArray1, int[] elementArray2) {
        int n1 = elementArray1.length;
        int n2 = elementArray2.length;
        int[] mergedArray = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        if (n1 == 0) 
            return elementArray2;
        
        if (n2 == 0) 
            return elementArray1;

        Arrays.sort(elementArray1);
        Arrays.sort(elementArray2);

        while (i<n1 && j < n2) {
            if (elementArray1[i] <= elementArray2[j]) {
                mergedArray[k++] = elementArray1[i++];
            } else {
                mergedArray[k++] = elementArray2[j++];
            }
        }

        while (i < n1) {
            mergedArray[k++] = elementArray1[i++];
        }

        while (j < n2) {
            mergedArray[k++] = elementArray2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        try {
            int[] mergedArray = mergeTwoSortedArrays(arr1, arr2);
            System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

