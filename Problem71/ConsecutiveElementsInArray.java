package Problem71;

import java.util.Arrays;

public class ConsecutiveElementsInArray {

    public static boolean checkElementsAreConsecutiveInArray(int[] elementArray) {
        int n = elementArray.length;

        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        if (n == 1) {
            return true;
        }

        Arrays.sort(elementArray);

        for(int i=0; i<n-1; i++) {
            if(elementArray[i+1] - elementArray[i] != 1) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Array Elements are: ");
        System.out.println(Arrays.toString(arr));

        boolean areConsecutive = checkElementsAreConsecutiveInArray(arr);
        try {
            if(areConsecutive)
                System.out.println("Elements in array are consecutive");
            else 
                System.out.println("Elements in array are not consecutive");
                
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
