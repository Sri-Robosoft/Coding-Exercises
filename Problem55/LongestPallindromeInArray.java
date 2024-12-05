package Problem55;

import java.util.Arrays;

public class LongestPallindromeInArray {

    public static String reverseString(String str) {
        if(str.length() == 1) {
            return str;
        }
        return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
    }

    public static String checkLongestPallindromeInArray(String[] elementsArr) {
        if (elementsArr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int length = 0;
        String longestPallindrome = "";

        for(int i = 0; i< elementsArr.length; i++) {
            boolean isPallindrome = elementsArr[i].equalsIgnoreCase(reverseString(elementsArr[i]));

            if(isPallindrome) {
                int elementLength = elementsArr[i].length();
                if(elementLength > length) {
                    length = elementLength;
                    longestPallindrome = elementsArr[i];
                }
            }
        }
        return longestPallindrome;
    }

    public static void main(String[] args) {
        String[] arr = { "Mom", "Hello", "Madam", "Racecar", "Good"};
        // String arr[] = {};

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));

        try {
            System.out.println("Longest Pallindrome in above array is: " +checkLongestPallindromeInArray(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
