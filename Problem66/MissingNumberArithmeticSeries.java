package Problem66;

import java.util.Arrays;

class MissingNumberArithmeticSeries {

    public static int findMissingNumberInArithmeticPSeries(int[] elementArray) {
        int n = elementArray.length;
        int d = Integer.MAX_VALUE;

        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        Arrays.sort(elementArray);
        
        
        for (int i=0; i<n-1; i++) {
            if(elementArray[i+1] - elementArray[i] < d)
                d = elementArray[i+1] - elementArray[i];
        }

        for(int i=0; i<n-1; i++) {
            if(elementArray[i+1] - elementArray[i] != d) {
                return elementArray[i] + d;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {19, 15, 3, 23, 7};
        // int[] arr = { };

        System.out.println("Arithmetic Series is: ");
        System.out.println(Arrays.toString(arr));

        int result = findMissingNumberInArithmeticPSeries(arr);
        try {
            if(result == -1)
                System.out.println("No missing number in arithmetic series");
            else
                System.out.println("Missing number in arithmetic series is: " +result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
