package Problem86;

import java.util.*;

public class MinimumNumberOfSwaps {

    public static int minSwapsToSort(int[] arr) {
        int n = arr.length;

        if(n == 0)
            throw new IllegalArgumentException("Array cannot be empty");

        Map<Integer, Integer> elementIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++)
            elementIndexMap.put(arr[i], i);

        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);

        boolean[] visitedElement = new boolean[n];
        int swapCount = 0;

        for (int i = 0; i < n; i++) {
            if (visitedElement[i] || arr[i] == sortedArray[i])
                continue;

            int cycleCount = 0;
            int j = i;
            while (!visitedElement[j]) {
                visitedElement[j] = true;
                j = elementIndexMap.get(sortedArray[j]);
                cycleCount++;
            }

            if (cycleCount > 1)
                swapCount += (cycleCount - 1);
        }

        return swapCount;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(arr));

        try {
            System.out.println("Minimum number of swaps to sort the array: " + minSwapsToSort(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

