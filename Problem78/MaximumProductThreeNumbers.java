package Problem78;

import java.util.*;

public class MaximumProductThreeNumbers {

    public static List<Integer> findMaximumProductThreeNumbers(int[] elementArray) {
        int n = elementArray.length;
        int maxProduct = Integer.MIN_VALUE;
        List<Integer> numbersList = new ArrayList<>();

        if (n < 3) 
            throw new IllegalArgumentException("Array must have at least three elements.");

        Arrays.sort(elementArray);

        for(int i=0; i<n; i++) {
            for(int j=i+1; j< n; j++) {
                for(int k=j+1; k<n; k++) {
                    int product = elementArray[i]*elementArray[j]*elementArray[k];
                    if(product > maxProduct) {
                        maxProduct = product;
                        numbersList.clear();
                        numbersList.add(elementArray[i]);
                        numbersList.add(elementArray[j]);
                        numbersList.add(elementArray[k]);
                    }
                }
            }
        }

        return numbersList;
    }
    public static void main(String[] args) {
      int[] arr = {-15, -22, 3, 8, 4};
    
        System.out.println("Array Elements: ");
        System.out.println(Arrays.toString(arr));

        try {
            System.out.println("Three Numbers with maximum product is: ");
            for(Integer numbers : findMaximumProductThreeNumbers(arr)) {
                System.out.print(numbers + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


