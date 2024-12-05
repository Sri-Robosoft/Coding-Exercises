package Problem56;

import java.util.*;

public class NonRepeatingElementInArray {

    public static Map<Integer, Integer> checkNonRepeatingElementInArray(int[] elementArray) {
        Map<Integer, Integer> occurenceMap = new HashMap<>();

        if (elementArray.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        for(int i = 0; i< elementArray.length; i++) {
            occurenceMap.put(elementArray[i], occurenceMap.getOrDefault(elementArray[i], 0) +1);
        }
        return occurenceMap;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 23, 4, 10, 4, 45, 76, 45, 19, 2, 9};
        // String arr[] = {};

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));

        try {
            for(Map.Entry<Integer, Integer> elem : checkNonRepeatingElementInArray(arr).entrySet()) {
                if(elem.getValue() ==1 )
                    System.out.print(elem.getKey() +" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
