package Problem82;

import java.util.Arrays;

public class CountOfSmallerNumberThanSelf {

    public static int findCountOfSmallerNumberThanSelf(int[] elementArray, int num) {
        int n = elementArray.length;
        int index = -1;
        int count = 0;

        if (n == 0) 
            throw new IllegalArgumentException("Array cannot be empty");
        
        for(int i=0; i<n; i++) {
            if(elementArray[i] == num) {
                index = i;
                break;
            }
        }

        if(index == -1)
            throw new IllegalArgumentException("Number in not present in the array");

        for(int i=index+1; i<n; i++) {
            if(num > elementArray[i])
                count++;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {5, 15, 9, 15, 18, 2, 3, 19, 100};
        int selfNumber = 15;
    
        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(arr));

        try {
            System.out.println("Count of smaller number than " +selfNumber+ " in above array is: " +findCountOfSmallerNumberThanSelf(arr, selfNumber));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
