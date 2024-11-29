package Problem34;

import java.util.*;

public class AnagramStringCheck {
    private Map<Character, Integer> anagramMap;

    AnagramStringCheck() {
        this.anagramMap = new HashMap<>();
    }
    public boolean checkIsAnagram(String str1, String str2) {

        for(int i=0; i<str1.length(); i++) {
            anagramMap.put(str1.toLowerCase().charAt(i), anagramMap.getOrDefault(str1.charAt(i), 0) + 1);
        }

        for(int i=0; i<str2.length(); i++) {
            anagramMap.put(str2.toLowerCase().charAt(i), anagramMap.getOrDefault(str2.charAt(i), 0) - 1);
        }

        for(Map.Entry<Character, Integer> e : anagramMap.entrySet()) {
            if(e.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
