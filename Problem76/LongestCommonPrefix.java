package Problem76;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] elementArray, String prefix, int index) {
        if (elementArray.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        if(index == elementArray[0].length()) {
            return prefix;
        }

        char currentChar = elementArray[0].charAt(index);

        for(int i=1; i<elementArray.length; i++) {
            if(index == elementArray[i].length() || elementArray[i].charAt(index) != currentChar) {
                return prefix;
            }
        }

        prefix += currentChar;
        
        return findLongestCommonPrefix(elementArray, prefix, index+1);
        
    }
    public static void main(String[] args) {
        String[] arr = { "He", "Hel", "Hello", "Hellllooo"};

        System.out.println("Array Elements: ");
        System.out.println(Arrays.toString(arr));

        try {
            String commonPrefix = findLongestCommonPrefix(arr, "", 0);
            System.out.println("Longest common prefix among the strings is: " + commonPrefix);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
