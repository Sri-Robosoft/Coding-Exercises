package Problem62;

import java.util.*;

public class PairSumClosestToNumber {

    public static int[] findPairSumClosesetToNumber(int[] elementArray, int target) {
        int[] closestPair = new int[2];
        int closestDiff = Integer.MAX_VALUE;
        int sum = 0;
        int diff = 0;

        if (elementArray.length==0 || elementArray.length==1) {
            throw new IllegalArgumentException("Array should have minimum of 2 elements");
        }

        Arrays.sort(elementArray);

        for(int i=0; i<elementArray.length; i++) {
            for(int j=i+1; j<elementArray.length; j++) {
                sum = elementArray[i] + elementArray[j];
                diff = Math.abs(sum-target);
                if(diff < closestDiff) {
                    closestDiff = diff;
                    closestPair[0] = elementArray[i];
                    closestPair[1] = elementArray[j];
                }
            }
        }
        return closestPair;
    }
    public static void main(String[] args) {
        int[] arr = {5, 15, 12, 9, 3};
        int x = 10;

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));
        try {
            int[] result = findPairSumClosesetToNumber(arr, x);
            System.out.println("Pair of elements with sum closest to "+x+" is: {" +result[0] + "," +result[1] + "}");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
