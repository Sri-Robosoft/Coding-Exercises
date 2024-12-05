package Problem52;

import java.util.Arrays;

public class ReverseArrayElements {

    public static int[] reverseElementsOfArray(int[] elementArr) {
        int n= elementArr.length;
        if(n == 0)
            throw new IllegalArgumentException("Array cannot be empty");

        for(int i=0; i<n/2; i++) {
            int temp = elementArr[i];
            elementArr[i] = elementArr[n-1-i];
            elementArr[n-1-i] = temp;
        }
        return elementArr;
    }
    public static void main(String[] args) {
        int[] arr = { 50, 40, 30, 20, 10};
        // int[] arr = { };

        System.out.println("Array elements before reversing: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array elements after Reversing: ");
        try {
            System.out.println(Arrays.toString(reverseElementsOfArray(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
