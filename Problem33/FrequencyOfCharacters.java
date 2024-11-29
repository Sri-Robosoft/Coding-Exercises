package Problem33;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        FrequencyOfCharactersString frequency = new FrequencyOfCharactersString();

        String str = "HelloHel";
        System.out.println("Frequency of Characters in " +str+ " are: ");
        frequency.findFrequencyOfCharacters(str.toLowerCase());
    }
}
