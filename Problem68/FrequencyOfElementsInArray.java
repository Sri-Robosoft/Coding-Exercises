package Problem68;

import java.util.*;

public class FrequencyOfElementsInArray {

    public static Map<Integer, Integer> findFrequencyOfElementInArray(int[] elementArray) {
        Map<Integer, Integer> occurenceMap = new LinkedHashMap<>();

        if (elementArray.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        Arrays.sort(elementArray);

        for(int i = 0; i< elementArray.length; i++) {
            occurenceMap.put(elementArray[i], occurenceMap.getOrDefault(elementArray[i], 0) +1);
        }
        return occurenceMap;
    }
    public static void main(String[] args) {
         int[] arr = { 3, 4, 3, 54, 64, 8, 96, 98, 77, 64, 45, 54, 76, 35, 64};

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Freqency of elements in above array");
        try {
            System.out.println(findFrequencyOfElementInArray(arr).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
