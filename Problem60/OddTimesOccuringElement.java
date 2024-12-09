package Problem60;

import java.util.*;

public class OddTimesOccuringElement {

    public static Map<Integer, Integer> findOddTimesOccuringElement(int[] elementArray) {
        Map<Integer, Integer> occurenceMap = new HashMap<>();

        if (elementArray.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        for(int i=0; i<elementArray.length; i++) {
            occurenceMap.put(elementArray[i], occurenceMap.getOrDefault(elementArray[i], 0) +1);
        }

        return occurenceMap;
    }
    public static void main(String[] args) {
        int[] arr = { 5, 20, 5, 29, 1, 1, 1, 20, 38, 5, 9, 1, 6, 1, 9, 38};
        // int[] arr = { };

        Map<Integer, Integer> occurMap = findOddTimesOccuringElement(arr);

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array elements appearing odd number of times: ");
        try {
            for(Map.Entry<Integer, Integer> elem : occurMap.entrySet()) {
                if(elem.getValue()%2!=0)
                    System.out.println("Element: " + elem.getKey() + " appears " + elem.getValue() + " times.");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
