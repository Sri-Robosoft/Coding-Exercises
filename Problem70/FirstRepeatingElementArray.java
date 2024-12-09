package Problem70;

import java.util.*;

public class FirstRepeatingElementArray {

    public static Map<Integer, Integer> findFirstRepeatingElement(int[] elementArray) {
        if (elementArray.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements to have a repeating value");
        }

        Map<Integer, Integer> occurenceMap = new LinkedHashMap<>();

        for(int i=0; i<elementArray.length; i++) {
            occurenceMap.put(elementArray[i], occurenceMap.getOrDefault(elementArray[i], 0) +1);
        }

        return occurenceMap;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 3, 4, 9, 7, 6, 3, 9, 8, 5, 6};

        System.out.println("Array Elements are: ");
        System.out.println(Arrays.toString(arr));

        try {
            for(Map.Entry<Integer, Integer> elem : findFirstRepeatingElement(arr).entrySet()) {
                if(elem.getValue() > 1) {
                    System.out.println("The first repeating character in array is: " +elem.getKey());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
