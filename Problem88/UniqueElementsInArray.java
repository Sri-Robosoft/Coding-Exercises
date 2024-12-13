package Problem88;

import java.util.*;

public class UniqueElementsInArray {

    public static int[] removeDuplicateElementsFromArray(int[] elementArray) {
        int n = elementArray.length;
        Set<Integer> uniqueSet = new HashSet<>();
        int[] uniqueArray;
        int i=0;

        if (n == 0) 
            throw new IllegalArgumentException("Array cannot be empty");

        for(int elem : elementArray) 
            uniqueSet.add(elem);

        uniqueArray = new int[uniqueSet.size()];

        for(int elem : uniqueSet) {
            uniqueArray[i] = elem;
            i++;
        }

        return uniqueArray;
    } 
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 5, 7, 9, 4, 1, 3, 7};

        System.out.println("Array elements are: " + Arrays.toString(arr));

        try {
            System.out.println("Array after removing duplicate elements: " +Arrays.toString(removeDuplicateElementsFromArray(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
