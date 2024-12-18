package Problem91;

import java.util.*;

public class UniqueEvenIntegers {
    public static void swap(int[] digits, int i, int j) {
        int temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    public static void permuteAndCheck(int[] digits, int index, Set<Integer> uniqueNumbers) {

        if (index==digits.length) {
            int number = 0;
            for (int digit : digits)
                number = number*10 + digit;

            if ((digits[0]!=0 || number==0) && number%2==0)
                uniqueNumbers.add(number);

            return;
        }

        for(int i=index; i<digits.length; i++) {
            swap(digits, i, index);
            permuteAndCheck(digits, index + 1, uniqueNumbers);
            swap(digits, i, index);
        }
    }


    public static Set<Integer> findUniqueEvenIntegers(int[] digits) {
        Set<Integer> uniqueNumbers = new TreeSet<>();

        if(digits.length == 0)
            throw new IllegalArgumentException("Array cannot be empty");

        permuteAndCheck(digits, 0, uniqueNumbers);
        return uniqueNumbers;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 0};

        System.out.println("Array elements are: ");
        System.out.println(Arrays.toString(digits));

        try {
            System.out.println("All unique even integers possible (no preceding zero): ");
            Set<Integer> uniqueEvenIntegers = findUniqueEvenIntegers(digits);
            System.out.println(uniqueEvenIntegers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




