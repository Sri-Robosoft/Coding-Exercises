package problem58;

import java.util.*;

public class ReplaceElementByRankArray {
    public static int[] replaceElementByRank(int[] elementArray) {
        int n = elementArray.length;

        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int rank = 1;
        Map<Integer, Integer> rankAssignMap = new HashMap<>();

        int[] sortedArray = elementArray.clone();
        Arrays.sort(sortedArray);

        for (int i=n-1; i>=0; i--) {
            if (!rankAssignMap.containsKey(sortedArray[i])) {
                rankAssignMap.put(sortedArray[i], rank);
                rank++;
            }
        }
        for (int i = 0; i < n; i++)
            elementArray[i] = rankAssignMap.get(elementArray[i]);

        return elementArray;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 20, 4, 29, 20, 38, 45, 9};
        // int[] arr = { };

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array after replacing elements with rank: ");
        try {
            System.out.println(Arrays.toString(replaceElementByRank(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
