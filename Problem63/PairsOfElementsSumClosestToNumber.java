package Problem63;

import java.util.*;

public class PairsOfElementsSumClosestToNumber {
    
public static List<int[]> findPairsOfElementSumClosesetToNumber(int[] elementArray, int target) {
        int closestDiff = Integer.MAX_VALUE;
        int sum = 0;
        int diff = 0;

        if (elementArray.length==0 || elementArray.length==1) {
            throw new IllegalArgumentException("Array should have minimum of 2 elements");
        }

        List<int[]> closestPairList = new ArrayList<>();

        for(int i=0; i<elementArray.length; i++) {
            for(int j=i+1; j<elementArray.length; j++) {
                sum = elementArray[i] + elementArray[j];
                diff = Math.abs(sum-target);
                if(diff < closestDiff) {
                    closestDiff = diff;
                    closestPairList.clear();
                    closestPairList.add(new int[] {elementArray[i], elementArray[j]});
                } else if(diff == closestDiff) {
                    closestPairList.add(new int[] {elementArray[i], elementArray[j]});
                }
            }
        }

        return closestPairList;
    }
    public static void main(String[] args) {
        int[] arr = {5, 15, 12, 9, 3};
        int x = 10;

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));
        try {
             List<int[]> results = findPairsOfElementSumClosesetToNumber(arr, x);
            System.out.println("Pairs of elements with sum closest to " + x + " are:");
            for (int[] pair : results) {
                System.out.println(Arrays.toString(pair));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

