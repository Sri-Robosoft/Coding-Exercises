package Problem96;

import java.util.*;

public class SwapKeyValuesInMap {

    public static Map<Integer, List<Character>> swapMapKeyValue(Map<Character, Integer> charMap) {
        Map<Integer, List<Character>> swappedMap = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            swappedMap
                .computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        return swappedMap;
    }

    public static Map<Character, Integer> addValuesToMap(char[] elementArray) {
        Map<Character, Integer> characterMap = new HashMap<>();
        int n = elementArray.length;

        if(n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        for(int i=0; i<n; i++) {
            characterMap.put(elementArray[i], characterMap.getOrDefault(elementArray[i], 0) + 1);
        }
        return characterMap;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'a', 'b', 'a'};

        System.out.println("Array elements are: " +Arrays.toString(arr));
        try {
            System.out.println("Array elements after storing in map: " +addValuesToMap(arr));
            System.out.println("Array elements after swapping key and values in map: " +swapMapKeyValue(addValuesToMap(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
