package Problem87;

import java.util.*;

public class TripletsSumEqualToNumber {

    public static List<Integer> findTripletsWithSumEqualToNumber(int[] elementArray, int num) {
        int n = elementArray.length;
        int sum = 0;
        List<Integer> tripletList = new ArrayList<>();

        if (n < 3) 
            throw new IllegalArgumentException("Array must have at least three elements.");
        
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    sum = elementArray[i] + elementArray[j] + elementArray[k];
                    if(sum == num) {
                        tripletList.add(elementArray[i]);
                        tripletList.add(elementArray[j]);
                        tripletList.add(elementArray[k]);
                        return tripletList;
                    }
                }
            }
        }

        return tripletList;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 5, 7, 9, 4, 3, 7};
        int num = 18;

        System.out.println("Array elements are: " + Arrays.toString(arr));

        try {
            List<Integer> triplets = findTripletsWithSumEqualToNumber(arr, num);
            if(triplets.isEmpty())
                System.out.println("No triplets found in above array with sum equal to " +num);
            else {
                System.out.print("Triplets with sum equal to " + num + " is: ");
                for (int elem : triplets)
                    System.out.print(elem + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
