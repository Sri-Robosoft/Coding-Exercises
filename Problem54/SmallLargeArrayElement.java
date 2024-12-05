package Problem54;

import java.util.Arrays;

public class SmallLargeArrayElement {

    public static void findMinMaxInArray(int[] elementArr) {

        if (elementArr == null || elementArr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = elementArr[0];
        int max = elementArr[0];

        for(int i=1; i<elementArr.length; i++) {
            if(elementArr[i] < min)
                min = elementArr[i];
            if(elementArr[i] > max)
                max = elementArr[i];
        }

        System.out.println("Smallest element in above array is: " +min);
        System.out.println("Largest element in above array is: " +max);
    }
    public static void main(String[] args) {
        int[] arr = { 50, 54, 81, 3, 97, 36, 58, 74, 40, 30, 16, 97, 20, 3, 10};
        // int[] arr = { };

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));

        try {
            findMinMaxInArray(arr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
