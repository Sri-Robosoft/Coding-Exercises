import java.util.*;

public class SubArrayEqualToSum {

    public static void findSubArraysEqualToSum(int[] elementArray, int index, List<Integer> subArray, int targetSum, List<List<Integer>> subArrayList) {
            
        int currentSum = 0;

        if (elementArray.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        for(int elem : subArray) 
            currentSum += elem;
        
        if (currentSum == targetSum) {
            if(subArrayList.contains(subArray)) {} 
            else 
                subArrayList.add(new ArrayList<>(subArray));
        }

        if (index >= elementArray.length) 
            return;

        subArray.add(elementArray[index]);
        findSubArraysEqualToSum(elementArray, index + 1, subArray, targetSum, subArrayList);
        
        subArray.remove(subArray.size() - 1);
        
        findSubArraysEqualToSum(elementArray, index + 1, subArray, targetSum, subArrayList);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int targetSum = 15;

        List<List<Integer>> subsets = new ArrayList<>();
        
        System.out.println("Array Elements: ");
        System.out.println(Arrays.toString(arr));
        
        try {
            findSubArraysEqualToSum(arr, 0, new ArrayList<>(), targetSum, subsets);
        
            System.out.println("Subarray with sum " + targetSum + ":");
            for (List<Integer> subset : subsets) 
                System.out.println(subset);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


