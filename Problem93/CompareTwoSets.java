package Problem93;

import java.util.*;

public class CompareTwoSets {

    public static Set<Integer> compareTwoSetsAndRetainCommonValues(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> commonSet = new HashSet<>();
        
        Set<Integer> smallerSet = (set1.size() < set2.size()) ? set1 : set2;
        Set<Integer> largerSet = (set1.size() >= set2.size()) ? set1 : set2;

        if(smallerSet.isEmpty() || largerSet.isEmpty())
            return commonSet; 

        for(Integer elem : smallerSet) {
            if (largerSet.contains(elem))
                commonSet.add(elem);
        }    

        return commonSet;
    }
    public static void main(String[] args) {
        Integer[] arr1 = {20, 12, 5, 0, 23, 20};
        Integer[] arr2 = {0, 11, 65, 70, 67, 12, 90};

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        try {
            Set<Integer> commonElements = compareTwoSetsAndRetainCommonValues(set1, set2);
            System.out.println("Common elements between the two sets: " + commonElements);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
