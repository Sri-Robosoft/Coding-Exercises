package Problem57;

import java.util.Arrays;

public class EvenPositionElementArray {

    public static int[] findEvenPositionElementsInArray(int[] elementArray) {
        int n = elementArray.length;
        int[] arr;
        int j = 0;

        if (n == 0)
            throw new IllegalArgumentException("Array cannot be empty");

        if(n%2==0) {
            arr = new int[n/2];
        } else {
            arr = new int[n/2+1];
        }

        for(int i=0; i<n; i++) {
            if(i%2==0) {
                arr[j] = elementArray[i];
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 20, 4, 29, 38, 5, 9};
        // int[] arr = { };

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array with even position elements: ");
        try {
            System.out.println(Arrays.toString(findEvenPositionElementsInArray(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
