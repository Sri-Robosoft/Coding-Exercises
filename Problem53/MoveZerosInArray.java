package Problem53;

import java.util.Arrays;

public class MoveZerosInArray {

    public static int[] moveZerosInArray(int[] elementArr1, String pos) {
        int n = elementArr1.length;
        int[] elementArr2 = new int[n];
        int j = 0;
        int k = n-1;

        if(n == 0)
            throw new IllegalArgumentException("Array cannot be empty");

        if(pos.equalsIgnoreCase("beg")) {
            for(int i=0; i<n; i++) {
                if(elementArr1[i] == 0) {
                    elementArr2[j] = elementArr1[i];
                    j++;
                } else {
                    elementArr2[k] = elementArr1[i];
                    k--;
                }
            }
        } else if(pos.equalsIgnoreCase("end")) {
            for(int i=0; i<n; i++) {
                if(elementArr1[i] == 0) {
                    elementArr2[k] = elementArr1[i];
                    k--;
                } else {
                    elementArr2[j] = elementArr1[i];
                    j++;
                }
            }
        }
        return elementArr2;
    }
    public static void main(String[] args) {
         int[] arr = { 10, 0, 5, 0, 2, 0, 4, 0};
        // int[] arr = { };
        String position = "beg";

        System.out.println("Array elements before moving zeros to " +position+ " are: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array elements before moving zeros to " +position+ " are: ");
        try {
            System.out.println(Arrays.toString(moveZerosInArray(arr, position)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
