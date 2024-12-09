package Problem65;

import java.util.Arrays;

public class OddEvenNumberInArray {

    public static int[] moveOddEvenNumbersInArray(int[] elementArray) {
        int n = elementArray.length;
        int[] oddEvenArray = new int[n];
        int index = 0;

        if (n == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        for(int i=0; i<n; i++) {
            if(elementArray[i]%2 != 0) {
                oddEvenArray[index] = elementArray[i];
                index++;
            }
        }

        for(int i=0; i<n; i++) {
            if(elementArray[i]%2 == 0) {
                oddEvenArray[index] = elementArray[i];
                index++;
            }
        }

        return oddEvenArray;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int[] arr = { };

        System.out.println("Array elements: ");
        System.out.println(Arrays.toString(arr));
        try {
            System.out.println("Array after seperating odd and even numbers is: ");
            System.out.println(Arrays.toString(moveOddEvenNumbersInArray(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
