package Problem51;

import java.util.Arrays;

public class SortArrayElements {

    public static int[] sortArrayElementsInAscending(int[] elementArr) {
        int n = elementArr.length;
        if (n == 0)
            throw new IllegalArgumentException("Array cannot be empty");

        for(int i=0; i<n - 1; i++) {
            for(int j=0; j<n - 1 - i; j++) {
                if(elementArr[j] > elementArr[j+1]) {
                    int temp = elementArr[j];
                    elementArr[j] = elementArr[j+1];
                    elementArr[j+1] = temp;
                }
            }
        }
        return elementArr;
    }

    public static void main(String[] args) {
        int[] arr = { 50, 20, 40, 10, 30};
        // int[] arr = { };

        System.out.println("Array elements before sorting: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array elements after sorting: ");
        try {
            System.out.println(Arrays.toString(sortArrayElementsInAscending(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}