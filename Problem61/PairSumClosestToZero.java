package Problem61;

import java.util.Arrays;

public class PairSumClosestToZero {

    public static int[] findPairSumClosestToZero(int[] elementArray) {
        int[] closestPair = new int[2];
        int closestSum =  Integer.MAX_VALUE;
        int sum = 0;

        if (elementArray.length==0 || elementArray.length==1) {
            throw new IllegalArgumentException("Array should have minimum of 2 elements");
        }

        for(int i=0; i<elementArray.length; i++) {
            for(int j=i+1; j<elementArray.length; j++) {
                sum = elementArray[i] + elementArray[j];
                if(sum<closestSum) {
                    closestSum = Math.abs(sum);
                    closestPair[0] = elementArray[i];
                    closestPair[1] = elementArray[j];
                }
            }
        }

        return closestPair;
    }
    public static void main(String[] args) {
        int[] arr = {9, -1, -3, 6, 4, 8};

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));
        try {
            int[] result = findPairSumClosestToZero(arr);
            System.out.println("Pair of elements with sum closest to zero is: {" +result[0] + "," +result[1] + "}");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
