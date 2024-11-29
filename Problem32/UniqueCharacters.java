package Problem32;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        UniqueCharactersInString nonRepeat = new UniqueCharactersInString();

        String str = "Heyy";
        boolean isUnique = nonRepeat.checkUniqueCharacter(str.toLowerCase());

        if(isUnique)
            System.out.println("String " +str+ " has unique characters");
        else
            System.out.println("String " +str+ " has no unique characters");
    }
}
