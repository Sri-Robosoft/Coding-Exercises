package Problem33;

import java.util.LinkedHashMap;
import java.util.Map;

class FrequencyOfCharactersString {
    private Map<Character,Integer> freqnecyMap;

    FrequencyOfCharactersString() {
        this.freqnecyMap = new LinkedHashMap<>();
    }

    public void findFrequencyOfCharacters(String str) {
        for(int i=0; i<str.length(); i++) {
            freqnecyMap.put(str.charAt(i), freqnecyMap.getOrDefault(str.charAt(i), 0) + 1);
        }

        for(Map.Entry<Character, Integer> freq : freqnecyMap.entrySet()) {
            System.out.println("{" + freq.getKey() + " -- " + freq.getValue() + "}");
        }
    }
}
