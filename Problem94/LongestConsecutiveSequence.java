package Problem94;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int findLongestConsecutiveSequenceInArray(Integer[] elementArray) {
        int n= elementArray.length;
        int currentStreak = 1;
        int maximumStreak = 1;

        if(n==0)
            throw new IllegalArgumentException("Array cannot be empty");

        Arrays.sort(elementArray);

        for(int i=1; i<n; i++) { 
            if (elementArray[i] != elementArray[i - 1]) {
                if(elementArray[i] - elementArray[i - 1] == 1) {
                    currentStreak++;
                } else {
                    maximumStreak = Math.max(maximumStreak, currentStreak);
                    currentStreak = 1;
                }
            }
        }

        return Math.max(maximumStreak, currentStreak);
    }
    public static void main(String[] args) {
        Integer[] arr = {49, 1, 3, 200, 2, 4, 70, 5};

        System.out.println("Array elements are: " +Arrays.toString(arr));

        try {
            System.out.println("The longest consecutive elements sequence length in above array is: " +findLongestConsecutiveSequenceInArray(arr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
