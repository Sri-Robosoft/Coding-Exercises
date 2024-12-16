package Problem92;

import java.util.*;

public class AppearanceOfNumber {

    public static boolean checkAppearanceOfNumber(int[] elementArray, int num, int countValue) {
        int n = elementArray.length;
        int count = 0;

        if(n==0)
            throw new IllegalArgumentException("Array cannot be empty");

        for(int i=0; i<n; i++) {
            if(elementArray[i]==num)
                count++;
            if(i>0 && elementArray[i]==num && elementArray[i-1]==num)   
                return false;
        }

        return count == countValue;
    }
    public static void main(String[] args) {
        int[] arr = {20, 10, 5, 20, 0, 23, 20};
        int num = 20;
        int countValue = 3;

        System.out.println("Array elements are: " +Arrays.toString(arr));

        try {
            boolean isAppearing = checkAppearanceOfNumber(arr, num, countValue);
            if(isAppearing)
                System.out.println(num + " is appearing " +countValue+ " times and no " +num+ "'s are next to each other in the array of integers");
            else 
                System.out.println(num + " is not appearing " +countValue+ " times or " +num+ "'s are next to each other in the array of integers");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}