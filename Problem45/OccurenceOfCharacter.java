import java.util.*;

public class OccurenceOfCharacter {

    public static void findOccurenceOfCharacter(String str, Map<Character,Integer> occurMap, int i) {
        if(i==str.length())
            return;
    
        occurMap.put(str.charAt(i), occurMap.getOrDefault(str.charAt(i), 0) + 1);
        findOccurenceOfCharacter(str, occurMap, i+1);
    }

    public static void main(String[] args) {
        Map<Character, Integer> occurenceMap = new HashMap<>();
        String str = "Helloo";
        char charOccurence = 'o';

        findOccurenceOfCharacter(str, occurenceMap, 0);
        System.out.println("Occurence of character " +charOccurence+ " in string " +str+ " is: " +occurenceMap.get(charOccurence));
    }
}


// public class OccurenceOfCharacter {
//     public static void findOccurenceOfCharacter(String str, char charOccurence) {
//         Map<Character, Integer> occurenceMap = new HashMap<>();
//         int length = str.length();
//         int i = 0;
//         if(str.isEmpty())
//             System.out.println("String is null");
//         while(length>0) {
//             occurenceMap.put(str.charAt(i), occurenceMap.getOrDefault(str.charAt(i), 0) + 1);
//             length--;
//             i++;
//         }
//         System.out.println("Occurence of character " +charOccurence+ " in string " +str+ " is: " +occurenceMap.get(charOccurence));
//     }
//     public static void main(String[] args) {
//         String str = "Hellloo";
//         findOccurenceOfCharacter(str, 'l');
//     }
// }

