package Problem97;

import java.util.*;

public class SortMapByValues {

    public static Map<Character, Integer> sortMapByValue(Map<Character, Integer> charMap) {

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(charMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        Map<Character, Integer> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<Character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
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
            System.out.println("Map after sorting by values: " +sortMapByValue(addValuesToMap(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
