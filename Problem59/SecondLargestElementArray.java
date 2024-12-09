package Problem59;

import java.util.Arrays;

public class SecondLargestElementArray {

    public static int findSecondLargestElementInArray(int[] elementArray, int pos) {
        int n = elementArray.length;

        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-1-i; j++) {
                if(elementArray[j] > elementArray[j+1]) {
                    int temp = elementArray[j];
                    elementArray[j] = elementArray[j+1];
                    elementArray[j+1] = temp;
                }
            }
        }

        for (int i = n - pos; i >= 0; i--) {
            if (elementArray[i] != elementArray[n - 1]) {
                return elementArray[i];
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {58, 63, 36, 14, 183, 43};
        // int[] arr = {30};
        // int[] arr = { };

        int elementPosition = 2;

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));
        try {
            int element = findSecondLargestElementInArray(arr, elementPosition);
            if(element == -1)
                System.out.println("No second largest element was found");
            else
                System.out.println("Second largest element in above array is: " +element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}