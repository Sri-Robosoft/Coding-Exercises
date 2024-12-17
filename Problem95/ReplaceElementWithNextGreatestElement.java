package Problem95;

import java.util.*;

public class ReplaceElementWithNextGreatestElement {

    public static int[] replaceEveryElementWithNextGreatestElement(int[] elementArray, int val) {
        int n = elementArray.length;

        if(n==0)
            throw new IllegalArgumentException("Array cannot be empty");

        int maxFromRight = val;

        for (int i = n - 1; i >= 0; i--) {
            int temp = elementArray[i];
            elementArray[i] = maxFromRight;
            maxFromRight = Math.max(temp, maxFromRight);
        }

        return elementArray;
    }
    public static void main(String[] args) {
        int[] arr = {49, 1, 3, 45, 36, 83, 28, 3, 3, 5, 8, 200, 2, 4, 70, 5};
        int lastValue = -1;

        System.out.println("Array elements are: " +Arrays.toString(arr));

        try {
            System.out.println("The array after replacing every element with the next greatest element: ");
            System.out.println(Arrays.toString(replaceEveryElementWithNextGreatestElement(arr, lastValue)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
